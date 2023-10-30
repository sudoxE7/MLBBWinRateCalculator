package com.exodus.MLBBWinRateCalculator;

import com.exodus.MLBBWinRateCalculator.listener.MLBBWinRateCalculatorListener;

/**
* Created by Andrei De Ocampo
* https://github.com/sudoxE7
* ytexodus7@gmail.com
* on 10/31/23.
*/

public class MLBBWinRateCalculator {
	private int totalMatches;
	private double winRatePercentage;
	private double targetWinRate;

	public MLBBWinRateCalculator(int totalMatches, double winRatePercentage, double targetWinRate) {
		this.totalMatches = totalMatches;
		this.winRatePercentage = winRatePercentage;
		this.targetWinRate = targetWinRate;
	}

	public void calculateWinRate(MLBBWinRateCalculatorListener mListener) {
		try {
			double finalResult = (totalMatches * (1 - winRatePercentage / 100) * (100 / (100 - targetWinRate)))
					- totalMatches;
			String message = String.format("You need approximately %d %s without losing to get a win rate of %.1f%%.",
					Math.round(finalResult), (Math.round(finalResult) <= 1) ? "victory" : "victories", targetWinRate);
			mListener.onWinRateCalculated(message);
		} catch (Exception e) {
			mListener.onWinRateCalculated("An error occurred while calculating the win rate.");
		}
	}
}