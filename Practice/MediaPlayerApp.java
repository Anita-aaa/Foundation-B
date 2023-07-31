// //20
// Interface defining methods for managing a playlist
interface Playlist {
    void addSong(String song);
    void removeSong(String song);
}

// Base class representing a media player
class MediaPlayer {
    void play() {
        System.out.println("Playing media.");
    }

    void pause() {
        System.out.println("Pausing media.");
    }

    void stop() {
        System.out.println("Stopping media.");
    }
}

// Video Player class inheriting from MediaPlayer and implementing Playlist interface
class VideoPlayer extends MediaPlayer implements Playlist {
    void rewind() {
        System.out.println("Rewinding media.");
    }

    void fastForward() {
        System.out.println("Fast-forwarding media.");
    }

    // Implementing methods from the Playlist interface
    @Override
    public void addSong(String song) {
        System.out.println("Adding song: " + song + " to the playlist.");
    }

    @Override
    public void removeSong(String song) {
        System.out.println("Removing song: " + song + " from the playlist.");
    }
}

public class MediaPlayerApp {
    public static void main(String[] args) {
        // Create an object of the VideoPlayer class
        VideoPlayer videoPlayer = new VideoPlayer();

        // Call methods from the VideoPlayer class (inherited from MediaPlayer)
        videoPlayer.play();
        videoPlayer.pause();
        videoPlayer.stop();

        // Call methods specific to VideoPlayer class
        videoPlayer.rewind();
        videoPlayer.fastForward();

        // Call methods from the Playlist interface (implemented by VideoPlayer)
        videoPlayer.addSong("Song 1");
        videoPlayer.addSong("Song 2");
        videoPlayer.removeSong("Song 2");
    }
}
