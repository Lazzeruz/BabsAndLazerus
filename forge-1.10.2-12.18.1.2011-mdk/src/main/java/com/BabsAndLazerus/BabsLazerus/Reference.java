package com.BabsAndLazerus.BabsLazerus;

public class Reference {
	
	public static final String MOD_ID = "BabsAndLazerusMod";
	public static final String NAME = "Babs & Lazerus Mod";
	public static final String VERSION = "1.0";
	
	public static final String CLIENT_PROXY_CLASS = "com.BabsAndLazerus.BabsLazerus.proxy.ClientProxy";
	public static final String SERVER_PROXY_CLASS = "com.BabsAndLazerus.BabsLazerus.proxy.ServerProxy";
	
	public static enum BabsLazerusItems {
		SEASHELL("SeaShell", "ItemSeaShell");
		
		private String unlocalizedName;
		private String registryName;
		
		BabsLazerusItems(String unlocalizedName, String registryName) {
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		}
		public String getUnlocalizedName() {
			return unlocalizedName;
		}
		public String getRegistryName() {
			return registryName;
		}
	}
}
