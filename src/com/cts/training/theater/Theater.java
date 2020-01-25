package com.cts.training.theater;

public enum Theater {
      SEAT,
      RECLINER,
      PLATINUM;
 public int getrate() {
	if(this==SEAT)
	{
		return 100;
	}
	if(this==RECLINER)
	{
		return 150;
	}
	if (this==PLATINUM)
		return 200;
	return 0;
 }
} 


