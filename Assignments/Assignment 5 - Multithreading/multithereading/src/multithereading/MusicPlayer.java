/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithereading;

import java.util.concurrent.locks.*;
import java.util.concurrent.CyclicBarrier;

public class MusicPlayer {
    private static final Lock lock = new ReentrantLock();
    private static final Condition nextTone = lock.newCondition();
    private static int turn = 1; // Keeps track of which thread should play
    private static final CyclicBarrier barrier = new CyclicBarrier(2);

    public static void main(String[] args) {
        FilePlayer player = new FilePlayer();

        // Thread 1 plays do, mi, sol, si, do-octave
        Thread thread1 = new Thread(() -> {
            String[] tones1 = {"Sounds/do.wav", "Sounds/mi.wav", "Sounds/sol.wav", "Sounds/si.wav", "Sounds/do-octave.wav"};
            playTones(player, tones1, 1);
        });

        // Thread 2 plays re, fa, la, do-octave
        Thread thread2 = new Thread(() -> {
            String[] tones2 = {"Sounds/re.wav", "Sounds/fa.wav", "Sounds/la.wav", "Sounds/do-octave.wav"};
            playTones(player, tones2, 2);
        });

        thread1.start();
        thread2.start();
    }

    private static void playTones(FilePlayer player, String[] tones, int threadId) {
        for (String tone : tones) {
            lock.lock();
            try {
                // Wait for the correct turn
                while (turn != threadId) {
                    nextTone.await();
                }

                // Special handling for "do-octave"
                if (tone.equals("do-octave.wav")) {
                    playDoOctave(player, tone);
                } else {
                    // Play the tone
                    player.play(tone);
                    System.out.println("Thread " + threadId + " played: " + tone);
                }

                // Add a half-second delay between tones
                Thread.sleep(500);

                // Switch turn to the other thread
                turn = (threadId == 1) ? 2 : 1;
                nextTone.signalAll(); // Notify other thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }
    }

    private static void playDoOctave(FilePlayer player, String tone) {
        try {
            barrier.await(); // Synchronize both threads here
            player.play(tone);
            System.out.println("Both threads played: " + tone);

            // Add a half-second delay after playing "do-octave"
            Thread.sleep(500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
