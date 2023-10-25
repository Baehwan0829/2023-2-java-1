package com.green.day19.ch7;

public abstract class Player {
    //
    // 추상 클래스
    // abstract : 클래스는 멤버메소드 중 하나의 멤버메소드가 추상메소드이면 나 자신도 추상클래스가 되어야한다.
    // ( 앱셱트 ): 추상메소드를 가지고 있지 않아도 추상클래스도 가능하다 ( 객체화를 안되게 할려고 )
    // 추상클래스는 객체화가 안된다.
    //
    // 추상 메소드
    // 추상 메소드는 오버라이딩의 강제성
    // abstract : static은 값이 존재해야 불러올 수 있으니까 안된다.
    //          : 구현부가 없는 것
    public abstract void play(int pos);

}
//
class PlayerTest{
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        VideoPlayer videoPlayer = new VideoPlayer();
        audioPlayer.play(10);
        videoPlayer.play(20);
        //
        Player player = audioPlayer; // 상속, 다향성, 추상
        player.play(50);
        //
        Player player1 = videoPlayer;
        // Player가 부모클래스이고 audio, video가 자식클래스이니 주소값을 불러올 수 있다.
        videoPlayer.play(100);

    }
}
//
class AudioPlayer extends Player{
    @Override // 애노태이션
    public void play(int pos) {
        System.out.println("Audio Play 위치 : " + pos);
    }
}
//
class VideoPlayer extends Player{
    @Override
    public void play(int pos) {
        System.out.println("video Play 위치 : " + pos);
    }
}
//
abstract class DvdPlayer extends Player{
// 사용빈도는 제로 ( 웹개발자 기준
// 자식클래스한테도 abstract 를 붙여도 가능하다.
}