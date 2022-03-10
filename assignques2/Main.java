package com.demo.assignques2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TvRemote s=new SonyTv();
		TvRemote p=new PanasonicTv();
		TvRemote b = new BPLTv();
		s.displayResolution();
		p.displayResolution();
		b.displayResolution();
		s.screenSize();
		p.screenSize();
		b.screenSize();
		s.remoteColor();
		p.remoteColor();
		b.remoteColor();
	}

}
