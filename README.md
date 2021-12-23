# springSample

webアプリの利用にあたっての手順  
  
0.PostgreSQL のインストール  
1.DbeverでPersonテーブル作成  
 　1.1 新規DB作成  
 　 　右クリック > 作成 > データベース　でDB作成  
 　 　Database name : testdb  
 　1.2 DB接続  
 　 　Host : localhost  
 　 　Port : 5432  
 　 　DataBase : testdb  
 　 　ユーザー名 : postgres  
 　 　パスワード : XXXXXXXX    ※手順0で設定した接続情報  
 　1.3 テーブル作成  
 　 　以下sql実行  
 　 　CREATE TABLE person (id SERIAL PRIMARY KEY, name VARCHAR(16), age INT);  
2.このソースをgit cloneする  
3.エクリプスでGradleプロジェクトとしてインポートする（Gradle > Existing Gradle Project）  
 　3.1 application.propertiesのspring.datasource.passwordをXXXXXXXXに変更する  
4.「実行(R)」⇒「Spring Bootアプリケーション」で実行  
