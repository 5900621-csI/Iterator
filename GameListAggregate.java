
class GameListAggregate {
	private Game[] list = new Game[20];
	private int numberOfStock;
	public Iterator createIterator() {
		return new GameListIterator(this);
	}
	public void add(Game game) {
		list[numberOfStock] = game;
		numberOfStock += 1;
	}
	public Object getAt(int number) {
		return list[number];
	}
	public int getNumberOfStock() {
		return numberOfStock;
	}
}
