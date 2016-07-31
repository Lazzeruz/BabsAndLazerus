package com.BabsAndLazerus.BabsLazerus.proxy;

import com.BabsAndLazerus.BabsLazerus.init.ModItems;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		ModItems.registerRenders();
	}
	

}
