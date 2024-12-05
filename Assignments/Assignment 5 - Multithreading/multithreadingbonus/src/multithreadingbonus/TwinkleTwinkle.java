/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingbonus;

import java.util.Set;
import java.util.concurrent.Semaphore;

public class TwinkleTwinkle {

    // Song sequence
    private static final String[] SONG = {
        "do", "do", "sol", "sol", "la", "la", "sol",
        "fa", "fa", "mi", "mi", "re", "re", "do",
        "sol", "sol", "fa", "fa", "mi", "mi", "re",
        "sol", "sol", "fa", "fa", "mi", "mi", "re",
        "do", "do", "sol", "sol", "la", "la", "sol",
        "fa", "fa", "mi", "mi", "re", "re", "do"
    };

    // Synchronization
    private static int currentNote = 0;
    private static final Semaphore semThread1 = new Semaphore(1);
    private static final Semaphore semThread2 = new Semaphore(0);

    // Audio directory path
    private static final String AUDIO_PATH = "Sounds/";

    public static void main(String[] args) {
        FilePlayer player = new FilePlayer();

        // Thread 1: Plays do, mi, sol, si, do-octave
        Thread thread1 = new Thread(() -> playNotes(
            Set.of("do", "mi", "sol", "si", "do-octave"),
            semThread1,
            semThread2,
            player
        ));

        // Thread 2: Plays re, fa, la, do-octave
        Thread thread2 = new Thread(() -> playNotes(
            Set.of("re", "fa", "la", "do-octave"),
            semThread2,
            semThread1,
            player
        ));

        thread1.start();
        thread2.start();
    }

    private static void playNotes(Set<String> validNotes, Semaphore mySem, Semaphore otherSem, FilePlayer player) {
        while (currentNote < SONG.length) {
            try {
                mySem.acquire(); // Wait for turn
                if (currentNote < SONG.length) {
                    String note = SONG[currentNote];
                    if (validNotes.contains(note)) {
                        String filePath = AUDIO_PATH + note + ".wav";
                        System.out.println(Thread.currentThread().getName() + " plays: " + note);
                        player.play(filePath);
                        Thread.sleep(500); // Half-second delay
                        currentNote++;
                    }
                }
                otherSem.release(); // Signal other thread
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
