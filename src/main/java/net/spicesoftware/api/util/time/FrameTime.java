package net.spicesoftware.api.util.time;

import net.spicesoftware.api.util.DeepCopyable;

import java.time.LocalTime;

/**
 * @since 2015/09/21
 */
public final class FrameTime implements DeepCopyable {

    private final int frames;
    private final float fps;

    private FrameTime(int frames, float fps) {
        this.frames = frames;
        this.fps = fps;
    }

    public int getFrames() {
        return frames;
    }

    public float getFPS() {
        return fps;
    }

    public int toMilliSecond() {
        return (int) (frames / fps * 1000);
    }

    public int toSecond() {
        return (int) (frames / fps);
    }

    public int toMininuts() {
        return (int) (frames / fps / 60);
    }

    public int toHours() {
        return (int) (frames / fps / 60 / 60);
    }

    public int toDay() {
        return (int) (frames / fps / 60 / 60 / 24);
    }

    public static FrameTime of(int frame, float fps) {
        return new FrameTime(frame, fps);
    }

    public static FrameTime from(LocalTime localTime, float fps) {
        return fromMillSec((int) (localTime.toNanoOfDay() / (10^6)), fps);
    }

    public static FrameTime fromMillSec(int milliSec, float fps) {
        return new FrameTime((int) Math.ceil(milliSec * fps / 1000), fps);
    }

    public static FrameTime fromSecond(int second, float fps) {
        return new FrameTime((int) (Math.ceil(fps * second)), fps);
    }

    @Override
    public FrameTime copyDeeply() {
        return new FrameTime(frames, fps);
    }
}
