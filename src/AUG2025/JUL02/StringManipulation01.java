package AUG2025.JUL02;

public class StringManipulation01 {
    // we can manipulate Strings
    // making a string all uppercase or down case
    //finding specific strings inside of string by using indexes
    // using substring method starting from an index and showing all after it until the end of substring
    //in substring last index is not included so if substring(0,4) given it means start from 0 and end up at 3
    // using contains method to find specific word inside the string
    //using startswith method to find if the rest of string starts with specified char from offset set

    String s ="I am bored or not?";

    // using endswith method we can control if string endswith specified word or character
    //using replace method we can replace specified words in string with a word we can create randomly
    //using replace method we can also change a specified character with another character or a word we can create randomly
    // all the specified characters changes into target word if there are more than 1 same character at same string
    //to specify a group of data used often we use regex which is regular expressions
    // some of the regexes are as follows
    // all natural numbers [0-9]
    // all lower letters [a-z]
    // all upper letters [A-Z]
    // all letters [a-zA-Z]
    // all letters and natural numbers [a-zA-Z0-9]
    // all punctuations \\p
    // all vowels [aeiouAEIOU]
    // all x,q,w letters [xqw]i
    // apart from all lower letters [^a-z]
    // when we use apart from we can use ^ sign right before the all regex of specified feature
    // regex is used inside replace all method
    String r="I am so bored";

}
