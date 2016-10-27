package player.hjc.com.muusicplayer.common;

import android.media.MediaPlayer;
import android.os.Handler;

/**
 * 音乐帮助类，获取音乐播放器
 * @author hjc
 */
public class MusicHelp {
    private static MediaPlayer player = null;
    private static Handler objHandler = null;

    public static MediaPlayer getMediaPlayer() {
        if (player == null)
            player = new MediaPlayer();
        return player;
    }


    public static Handler getHandler() {

        if (objHandler == null)
            objHandler = new Handler();

        return objHandler;

    }
}
