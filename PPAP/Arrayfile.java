20170124_memo
=============

meta:  
20170124

---

# PPAP

A * B => ??

A,B: 単語( 名詞; noun )
?? : 考えたこと

## 機能

- 単語を表示する( random; ランダム )
	- テキストファイルに、たくさん書いておきましょう
		- 単語: 名詞( ものの名前; PETボトル、冷蔵庫、とか )
- 考える（人間が考える）
- 書く（考えたことを、書く）
- 保存する（テキストファイルに、保存する）


## 準備

### 単語: words.txt

車
ゴミ箱
財布（さいふ）
カレンダー
エアコン
イチゴ
ビスケット
大根（だいこん）
バナナ
たまご
レモン
携帯（けいたい）
傘、笠（かさ）
ノート
シートベルト
パソコン
銃（じゅう; gun）
マンゴー
パン
IoT( Internet Of Things )


### ブランチ、フォルダ

新しいブランチ、新しいフォルダを作ります。

- ブランチ: PPAP
- フォルダ: PPAP

```bash
cd
cd documents
cd github
cd 160xxx
git checkout -b PPAP
mkdir PPAP
cd PPAP
```



## プログラミング

### Aloha.java

"ALOHA!"と20回表示する。



### Random.java

1～20までの数を、ランダムに表示する。

Math.random()を使う。

1. そのまま表示する

	```java
	System.out.println(Math.random());
	```

2. 0～9の数をつくる

	ランダムの、小さい数を、int（整数）に変えてもらう。

	```java
	int number = (int)(Math.random() * 10);
	```

	プログラムは、次のとおり。

	```java
	public class Random {
		public static void main(String[] args) {
			// ランダムで、int（整数）データをつくる
			int number = (int)(Math.random()*10);

			// 表示する
			System.out.println(number);
		}
	}
	```

3. 0~21までの数をつくる

	```java
	int number = (int)(Math.random()*22);
	```

### ArrayFile.java

ファイルからデータを読んで、配列(array)に入れる。

- ファイル
	- words.txt

0. データを、配列(array)に入れる

	- 配列
		- 文字列(String)のデータ
		- String[] words

	最初に、インポートが必要です。

	```java
	import java.io.*;
	```

	// ファイルから、データを読んで、表示する（1個）
	main()の中は、つぎのとおり。

	```java
	// ファイルを開く
	FileReader fr;
	BufferedReader br;

	try {
		// ファイルを開く
		fr = new FileReader("words.txt");
		br = new BufferedReader(fr);

		// ファイルから、データをもらう
		String data = br.readLine();

		// 表示する
		System.out.println(data);

	} catch(IOException e) {
		System.out.println("IO Error.");
	}
	```


	// ファイルから、データを読んで、表示する（22個）
	```java
		....
		....
		br = new BufferedReader(fr);

		// ファイルから、データをもらって、表示しつづける。
		String data;
		while((data = br.readLine()) != null) {
			System.out.println(data);
		}
		....
		....
	```

	// ファイルから、データを読んで、配列に入れる

	最初に、データの準備をする
	```java
	FileReader fr;
	BufferedReader br;
	String[] words = new String[22];

	```java
		....
		....
		br = new BufferedReader(fr);

		// ファイルから、データをもらって、表示 & 配列に入れる。
		String data;
		int i = 0;

		while((data = br.readLine()) != null) {
			System.out.println(data);		// 表示する
			words[i] = data;				// 配列に入れる
			i++;							// i = i + 1;
		}
		....
		....
	```

1. 配列から、データをぜんぶ表示する

	words[]の中のデータ（22個）を、表示する。

	```java
	// 22回、くり返す。
	for(int i = 0;  i < 22;  i++) {
		String word = words[i];
		System.out.println(word);
	}
	```

2. 配列から、データを2個、ランダムに表示する。

	0. 配列の、最初の2個を表示する
		- 22回表示するのを、やめる（消す）

	```java
	import java.io.*;

	public class ArrayFile {
		public static void main(String[] args) {
			// データを準備する
			FileReader fr;
			BufferedReader br;
			String[] words = new String[23];
			int num;

			// ファイルを開いて、データを配列に入れる。
			try {
				// ファイルを開く
				fr = new FileReader("words.txt");
				br = new BufferedReader(fr);

				// データをもらって、配列に入れる
				String data;
				int i = 0;

				while((data = br.readLine()) != null) {
					words[i] = data;
					i++;
				}
				num = i;
			} catch(IOException e) {
				System.out.println("IO Error.");
			}

			// 配列から、データを表示する
			//   最後の2個を表示する
			// System.out.println(words[20]);
			// System.out.println(words[21]);

			//   ランダムに2個表示する
			int rdm = (int)(Math.random()*num);
			System.out.println(words[rdm]);
			rdm = (int)(Math.random()*num);
			System.out.println(words[rdm]);


			// 確認する。ぜんぶ表示する。
			for(int i = 0;  i < num;  i++) {

			}
		}
	}
	```


### Memo.java

メモを書いて、ファイルに保存する。



end.