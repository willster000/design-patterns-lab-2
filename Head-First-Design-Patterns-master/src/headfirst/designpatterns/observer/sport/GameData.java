package headfirst.designpatterns.observer.sport;

import java.util.*;

// this is a 1v1 soccer game class 
public class GameData implements Subject {
    private List<Observer> observers;
    private int homeScore;
    private int awayScore;
    // half is an enum that can be either FIRST or SECOND
    /*private enum Half {
        FIRST, 
        SECOND
    }*/ 
    private boolean half;
    private String homePlayer;
    private String awayPlayer;

    public GameData() {
        // create a list of observers
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
		observers.add(o);
	}
	
	public void removeObserver(Observer o) {
		observers.remove(o);
	}
	
	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(homeScore, awayScore, half, homePlayer, awayPlayer);
		}
	}

	public void gameChanged() {
		notifyObservers();
	}

    public void setGameChanges(int homeScore, int awayScore, boolean half, String homePlayer, String awayPlayer) {
        this.homeScore = homeScore;
        this.awayScore = awayScore;
        this.half = half;
        this.homePlayer = homePlayer;
        this.awayPlayer = awayPlayer;
        gameChanged();
    }

	}

