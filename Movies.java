class Decipherer {

    public static String decrypt(String message) {
      int messageLength = message.length() / 2;
      String substringMessage = message.substring(5, (5 + messageLength));
      String replaceString = substringMessage.replace("@#?", " ");
      String reverse = new StringBuilder(replaceString).reverse().toString();
      return reverse;
    }
  
    public static void main(String[] args) {
      System.out.println(decrypt("0@sn9sirppa@#?ia'jgtvryko1"));
      System.out.println(decrypt("q8e?wsellecif@#?sel@#?setuotpazdsy0*b9+mw@x1vj"));
      System.out.println(decrypt("aopi?sedohtém@#?sedhtmg+p9l!"));
    }
  
  }