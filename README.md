# 📖 To Doリストアプリ - コマンドライン版

<div align="center">

<p><strong>Python / JavaScript / Java 対応のシンプルで直感的に使えるコマンドラインTo Doリストアプリ 📝</strong></p>

<img src="https://img.shields.io/badge/Python-3776AB?style=for-the-badge&logo=python&logoColor=white" alt="Python">
<img src="https://img.shields.io/badge/Node.js-339933?style=for-the-badge&logo=node.js&logoColor=white" alt="Node.js">
<img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" alt="Java">

</div>

---

## 🌐 動作環境

| 言語 | 必要環境 |
|------|----------|
| 🐍 Python版 | Python 3 |
| 🌐 JavaScript版 | Node.js |
| ☕ Java版 | Java Development Kit (JDK) |

---

🐍 Python版
動作環境
Python 3

ファイル構成
C:\Users\myname\
└── Todo\
    └── todo.py

実行方法
プロジェクトディレクトリに移動します。

cd C:\Users\myname\Todo

以下のコマンドでアプリケーションを実行します。

python todo.py

これにより、To Doリストのメニューが表示されます。

☕ JavaScript (Node.js)版
動作環境
Node.js

ファイル構成
C:\Users\myname\
└── Todo\
    └── todo.js

実行方法
プロジェクトディレクトリに移動します。

cd C:\Users\myname\Todo

以下のコマンドでアプリケーションを実行します。

node todo.js

これにより、To Doリストのメニューが表示されます。

♨️ Java版
動作環境
Java Development Kit (JDK)

ファイル構成
C:\Users\myname\
└── Todo\
    ├── Task.java
    └── ToDoListApp.java

実行方法
Java版は、実行前にソースコードをコンパイル（コンピュータが実行できる形式に変換）する必要があります。

1. JDKのセットアップ
javacコマンドが認識されない場合、JDKが正しくインストールされていないか、環境変数の設定が必要です。

JDKのインストール: Oracle JDK や OpenJDK などからJDKをダウンロードし、インストールします。

環境変数の設定:

Windowsの検索バーで「環境変数」と入力し、「システム環境変数の編集」を開きます。

Path変数に、インストールしたJDKのbinディレクトリのパス（例: C:\Program Files\Java\jdk-21\bin）を追加します。

コマンドプロンプトの再起動: 設定を反映させるため、開いているコマンドプロンプトをすべて閉じてから、再度開きます。

動作確認: 新しいコマンドプロンプトで以下のコマンドを実行し、バージョン情報が表示されれば設定は完了です。

javac -version

2. コンパイル
プロジェクトディレクトリに移動します。

cd C:\Users\myname\Todo

以下のコマンドでJavaソースコードをコンパイルします。

javac ToDoListApp.java Task.java

成功すると、ディレクトリ内にToDoListApp.classとTask.classファイルが生成されます。

3. 実行
コンパイルが完了したら、以下のコマンドでアプリケーションを実行します。

java ToDoListApp

これにより、To Doリストのメニューが表示されます。
