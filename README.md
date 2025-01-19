# UselessExtention

Burp の拡張機能を勉強しよう

## 前提

- jdk-17 ( version 65 以下)

## ビルド

下記コマンドで実行した結果が `build/libs/`に設置されます

```
gradlew build
```

## 設定

ビルドを行う JDK のファイルパス

```
# gradle.properties

org.gradle.java.home=/Path/To/SDK
```
