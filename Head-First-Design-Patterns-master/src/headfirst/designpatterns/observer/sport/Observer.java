package headfirst.designpatterns.observer.sport;

@FunctionalInterface
// Observer is a functional interface since it has only one method
// to implement
public interface Observer {
	public void update(int homeScore, int awayScore, boolean half,
        String homePlayer, String awayPlayer);
}
