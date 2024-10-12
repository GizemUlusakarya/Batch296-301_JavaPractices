package practices.practice04;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04_ArrayList_Playlist {
    /*
    Scenario:
        Imagine you're managing a playlist of songs on a music app.
        You have a list of songs in a specific order.
        Now, for some reason, you want to move the first few songs from the start of the playlist to the end.
        This is what we call rotating the playlist.
        And you want to rotate the playlist by 3 positions,
        you will move the first three songs to the end of the list.
    Task:
        Write a Java method that takes an ArrayList<String> representing a playlist of songs,
        and an integer n that represents how many songs you want to rotate.
        After rotating the playlist, the order of songs will be adjusted, with the first n songs moved to the end.

    for example:
        Song A, Song B, Song C, Song D, Song E, Song F, Song G
        Song D, Song E, Song F, Song G, Song A, Song B, Song C
     */

    public static void main(String[] args) {
        //Step1: Create a playlist (ArrayList) with 7 songs
        ArrayList<String> playlist = new ArrayList<>();
        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");
        playlist.add("Song E");
        playlist.add("Song F");
        playlist.add("Song G");
        System.out.println("playlist = " + playlist);

        //Step2: Define how many positions to rotate
        //int n= 3;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int input = scan.nextInt();

        //Step3: Handle cases where n> size of the playlist
        int size = playlist.size();
        input = input % size; // Ensure that n is within the bounds of the playlist size

        //Step4: Perform the rotation only if n is not zero
        if(input !=0){ // no need to rotate if n is zero
            //Step5: Store the first n songs in a temporary list.
            ArrayList<String> temp = new ArrayList<>();
            for (int i = 0; i<input; i++){
                temp.add(playlist.get(i)); //Storing the first n songs
            }

            //Step6: Shift the remaining songs to the left by n positions
            for (int i=input; i< size; i++){
                playlist.set(i-input, playlist.get(i)); //Shifting songs
            }
            System.out.println("playlist = " + playlist); //Song D, Song E, Song F, Song D, Song E, Song F,


            //Step7: Place the stored songs (first n) from temp into the last positions
            for(int i= 0; i<input; i++){
                playlist.set(size - input + i, temp.get(i)); // Moving the first n songs to the end
            }
        }

        //Step8: Print the playlist after rotation
        System.out.println("Playlist after rotation: " + playlist);
    }
}
