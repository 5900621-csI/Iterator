
public class IteratorTest {

	public static void main(String[] args) {
		GameListAggregate gameListAggregate = new GameListAggregate();
		Iterator iterator = gameListAggregate.createIterator();
		gameListAggregate.add(new Game("ゼロピース", 470));
		gameListAggregate.add(new Game("スネークボール", 230));
		gameListAggregate.add(new Game("スラムアップ", 540));
		gameListAggregate.add(new Game("メンマ", 520));
		iterator.first(); // まず探す場所を先頭位置にしてもらう
		while ( ! iterator.isDone() ) { // まだある？ まだあるよ！
		Game game = (Game)iterator.getItem(); // はいどうぞ (と受取る)
		System.out.println(game.getName());
		iterator.next(); // 次を頂戴
		}
	}
}
