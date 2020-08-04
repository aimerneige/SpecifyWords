package com.aimerneige.specifywords.utils;

import java.util.ArrayList;

// Convert input string
public class Convert {

    // test done
    public static String convert2style0(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("𝓐");
        Style_Upper.add("𝓑");
        Style_Upper.add("𝓒");
        Style_Upper.add("𝓓");
        Style_Upper.add("𝓔");
        Style_Upper.add("𝓕");
        Style_Upper.add("𝓖");
        Style_Upper.add("𝓗");
        Style_Upper.add("𝓘");
        Style_Upper.add("𝓙");
        Style_Upper.add("𝓚");
        Style_Upper.add("𝓛");
        Style_Upper.add("𝓜");
        Style_Upper.add("𝓝");
        Style_Upper.add("𝓞");
        Style_Upper.add("𝓟");
        Style_Upper.add("𝓠");
        Style_Upper.add("𝓡");
        Style_Upper.add("𝓢");
        Style_Upper.add("𝓣");
        Style_Upper.add("𝓤");
        Style_Upper.add("𝓥");
        Style_Upper.add("𝓦");
        Style_Upper.add("𝓧");
        Style_Upper.add("𝓨");
        Style_Upper.add("𝓩");

        Style_Lower.add("𝓪");
        Style_Lower.add("𝓫");
        Style_Lower.add("𝓬");
        Style_Lower.add("𝓭");
        Style_Lower.add("𝓮");
        Style_Lower.add("𝓯");
        Style_Lower.add("𝓰");
        Style_Lower.add("𝓱");
        Style_Lower.add("𝓲");
        Style_Lower.add("𝓳");
        Style_Lower.add("𝓴");
        Style_Lower.add("𝓵");
        Style_Lower.add("𝓶");
        Style_Lower.add("𝓷");
        Style_Lower.add("𝓸");
        Style_Lower.add("𝓹");
        Style_Lower.add("𝓺");
        Style_Lower.add("𝓻");
        Style_Lower.add("𝓼");
        Style_Lower.add("𝓽");
        Style_Lower.add("𝓾");
        Style_Lower.add("𝓿");
        Style_Lower.add("𝔀");
        Style_Lower.add("𝔁");
        Style_Lower.add("𝔂");
        Style_Lower.add("𝔃");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type1(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("𝐀");
        Style_Upper.add("𝐁");
        Style_Upper.add("𝐂");
        Style_Upper.add("𝐃");
        Style_Upper.add("𝐄");
        Style_Upper.add("𝐅");
        Style_Upper.add("𝐆");
        Style_Upper.add("𝐇");
        Style_Upper.add("𝐈");
        Style_Upper.add("𝐉");
        Style_Upper.add("𝐊");
        Style_Upper.add("𝐋");
        Style_Upper.add("𝐌");
        Style_Upper.add("𝐍");
        Style_Upper.add("𝐎");
        Style_Upper.add("𝐏");
        Style_Upper.add("𝐐");
        Style_Upper.add("𝐑");
        Style_Upper.add("𝐒");
        Style_Upper.add("𝐓");
        Style_Upper.add("𝐔");
        Style_Upper.add("𝐕");
        Style_Upper.add("𝐖");
        Style_Upper.add("𝐗");
        Style_Upper.add("𝐘");
        Style_Upper.add("𝐙");

        Style_Lower.add("𝐚");
        Style_Lower.add("𝐛");
        Style_Lower.add("𝐜");
        Style_Lower.add("𝐝");
        Style_Lower.add("𝐞");
        Style_Lower.add("𝐟");
        Style_Lower.add("𝐠");
        Style_Lower.add("𝐡");
        Style_Lower.add("𝐢");
        Style_Lower.add("𝐣");
        Style_Lower.add("𝐤");
        Style_Lower.add("𝐥");
        Style_Lower.add("𝐦");
        Style_Lower.add("𝐧");
        Style_Lower.add("𝐨");
        Style_Lower.add("𝐩");
        Style_Lower.add("𝐪");
        Style_Lower.add("𝐫");
        Style_Lower.add("𝐬");
        Style_Lower.add("𝐭");
        Style_Lower.add("𝐮");
        Style_Lower.add("𝐯");
        Style_Lower.add("𝐰");
        Style_Lower.add("𝐱");
        Style_Lower.add("𝐲");
        Style_Lower.add("𝐳");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type2(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("𝗔");
        Style_Upper.add("𝗕");
        Style_Upper.add("𝗖");
        Style_Upper.add("𝗗");
        Style_Upper.add("𝗘");
        Style_Upper.add("𝗙");
        Style_Upper.add("𝗚");
        Style_Upper.add("𝗛");
        Style_Upper.add("𝗜");
        Style_Upper.add("𝗝");
        Style_Upper.add("𝗞");
        Style_Upper.add("𝗟");
        Style_Upper.add("𝗠");
        Style_Upper.add("𝗡");
        Style_Upper.add("𝗢");
        Style_Upper.add("𝗣");
        Style_Upper.add("𝗤");
        Style_Upper.add("𝗥");
        Style_Upper.add("𝗦");
        Style_Upper.add("𝗧");
        Style_Upper.add("𝗨");
        Style_Upper.add("𝗩");
        Style_Upper.add("𝗪");
        Style_Upper.add("𝗫");
        Style_Upper.add("𝗬");
        Style_Upper.add("𝗭");

        Style_Lower.add("𝗮");
        Style_Lower.add("𝗯");
        Style_Lower.add("𝗰");
        Style_Lower.add("𝗱");
        Style_Lower.add("𝗲");
        Style_Lower.add("𝗳");
        Style_Lower.add("𝗴");
        Style_Lower.add("𝗵");
        Style_Lower.add("𝗶");
        Style_Lower.add("𝗷");
        Style_Lower.add("𝗸");
        Style_Lower.add("𝗹");
        Style_Lower.add("𝗺");
        Style_Lower.add("𝗻");
        Style_Lower.add("𝗼");
        Style_Lower.add("𝗽");
        Style_Lower.add("𝗾");
        Style_Lower.add("𝗿");
        Style_Lower.add("𝘀");
        Style_Lower.add("𝘁");
        Style_Lower.add("𝘂");
        Style_Lower.add("𝘃");
        Style_Lower.add("𝘄");
        Style_Lower.add("𝘅");
        Style_Lower.add("𝘆");
        Style_Lower.add("𝘇");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type3(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("𝘈");
        Style_Upper.add("𝘉");
        Style_Upper.add("𝘊");
        Style_Upper.add("𝘋");
        Style_Upper.add("𝘌");
        Style_Upper.add("𝘍");
        Style_Upper.add("𝘎");
        Style_Upper.add("𝘏");
        Style_Upper.add("𝘐");
        Style_Upper.add("𝘑");
        Style_Upper.add("𝘒");
        Style_Upper.add("𝘓");
        Style_Upper.add("𝘔");
        Style_Upper.add("𝘕");
        Style_Upper.add("𝘖");
        Style_Upper.add("𝘗");
        Style_Upper.add("𝘘");
        Style_Upper.add("𝘙");
        Style_Upper.add("𝘚");
        Style_Upper.add("𝘛");
        Style_Upper.add("𝘜");
        Style_Upper.add("𝘝");
        Style_Upper.add("𝘞");
        Style_Upper.add("𝘟");
        Style_Upper.add("𝘠");
        Style_Upper.add("𝘡");

        Style_Lower.add("𝘢");
        Style_Lower.add("𝘣");
        Style_Lower.add("𝘤");
        Style_Lower.add("𝘥");
        Style_Lower.add("𝘦");
        Style_Lower.add("𝘧");
        Style_Lower.add("𝘨");
        Style_Lower.add("𝘩");
        Style_Lower.add("𝘪");
        Style_Lower.add("𝘫");
        Style_Lower.add("𝘬");
        Style_Lower.add("𝘭");
        Style_Lower.add("𝘮");
        Style_Lower.add("𝘯");
        Style_Lower.add("𝘰");
        Style_Lower.add("𝘱");
        Style_Lower.add("𝘲");
        Style_Lower.add("𝘳");
        Style_Lower.add("𝘴");
        Style_Lower.add("𝘵");
        Style_Lower.add("𝘶");
        Style_Lower.add("𝘷");
        Style_Lower.add("𝘸");
        Style_Lower.add("𝘹");
        Style_Lower.add("𝘺");
        Style_Lower.add("𝘻");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type4(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("𝘼");
        Style_Upper.add("𝘽");
        Style_Upper.add("𝘾");
        Style_Upper.add("𝘿");
        Style_Upper.add("𝙀");
        Style_Upper.add("𝙁");
        Style_Upper.add("𝙂");
        Style_Upper.add("𝙃");
        Style_Upper.add("𝙄");
        Style_Upper.add("𝙅");
        Style_Upper.add("𝙆");
        Style_Upper.add("𝙇");
        Style_Upper.add("𝙈");
        Style_Upper.add("𝙉");
        Style_Upper.add("𝙊");
        Style_Upper.add("𝙋");
        Style_Upper.add("𝙌");
        Style_Upper.add("𝙍");
        Style_Upper.add("𝙎");
        Style_Upper.add("𝙏");
        Style_Upper.add("𝙐");
        Style_Upper.add("𝙑");
        Style_Upper.add("𝙒");
        Style_Upper.add("𝙓");
        Style_Upper.add("𝙔");
        Style_Upper.add("𝙕");

        Style_Lower.add("𝙖");
        Style_Lower.add("𝙗");
        Style_Lower.add("𝙘");
        Style_Lower.add("𝙙");
        Style_Lower.add("𝙚");
        Style_Lower.add("𝙛");
        Style_Lower.add("𝙜");
        Style_Lower.add("𝙝");
        Style_Lower.add("𝙞");
        Style_Lower.add("𝙟");
        Style_Lower.add("𝙠");
        Style_Lower.add("𝙡");
        Style_Lower.add("𝙢");
        Style_Lower.add("𝙣");
        Style_Lower.add("𝙤");
        Style_Lower.add("𝙥");
        Style_Lower.add("𝙦");
        Style_Lower.add("𝙧");
        Style_Lower.add("𝙨");
        Style_Lower.add("𝙩");
        Style_Lower.add("𝙪");
        Style_Lower.add("𝙫");
        Style_Lower.add("𝙬");
        Style_Lower.add("𝙭");
        Style_Lower.add("𝙮");
        Style_Lower.add("𝙯");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type5(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("𝑨");
        Style_Upper.add("𝑩");
        Style_Upper.add("𝑪");
        Style_Upper.add("𝑫");
        Style_Upper.add("𝑬");
        Style_Upper.add("𝑭");
        Style_Upper.add("𝑮");
        Style_Upper.add("𝑯");
        Style_Upper.add("𝑰");
        Style_Upper.add("𝑱");
        Style_Upper.add("𝑲");
        Style_Upper.add("𝑳");
        Style_Upper.add("𝑴");
        Style_Upper.add("𝑵");
        Style_Upper.add("𝑶");
        Style_Upper.add("𝑷");
        Style_Upper.add("𝑸");
        Style_Upper.add("𝑹");
        Style_Upper.add("𝑺");
        Style_Upper.add("𝑻");
        Style_Upper.add("𝑼");
        Style_Upper.add("𝑽");
        Style_Upper.add("𝑾");
        Style_Upper.add("𝑿");
        Style_Upper.add("𝒀");
        Style_Upper.add("𝒁");

        Style_Lower.add("𝒂");
        Style_Lower.add("𝒃");
        Style_Lower.add("𝒄");
        Style_Lower.add("𝒅");
        Style_Lower.add("𝒆");
        Style_Lower.add("𝒇");
        Style_Lower.add("𝒈");
        Style_Lower.add("𝒉");
        Style_Lower.add("𝒊");
        Style_Lower.add("𝒋");
        Style_Lower.add("𝒌");
        Style_Lower.add("𝒍");
        Style_Lower.add("𝒎");
        Style_Lower.add("𝒏");
        Style_Lower.add("𝒐");
        Style_Lower.add("𝒑");
        Style_Lower.add("𝒒");
        Style_Lower.add("𝒓");
        Style_Lower.add("𝒔");
        Style_Lower.add("𝒕");
        Style_Lower.add("𝒖");
        Style_Lower.add("𝒗");
        Style_Lower.add("𝒘");
        Style_Lower.add("𝒙");
        Style_Lower.add("𝒚");
        Style_Lower.add("𝒛");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type6(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("𝙰");
        Style_Upper.add("𝙱");
        Style_Upper.add("𝙲");
        Style_Upper.add("𝙳");
        Style_Upper.add("𝙴");
        Style_Upper.add("𝙵");
        Style_Upper.add("𝙶");
        Style_Upper.add("𝙷");
        Style_Upper.add("𝙸");
        Style_Upper.add("𝙹");
        Style_Upper.add("𝙺");
        Style_Upper.add("𝙻");
        Style_Upper.add("𝙼");
        Style_Upper.add("𝙽");
        Style_Upper.add("𝙾");
        Style_Upper.add("𝙿");
        Style_Upper.add("𝚀");
        Style_Upper.add("𝚁");
        Style_Upper.add("𝚂");
        Style_Upper.add("𝚃");
        Style_Upper.add("𝚄");
        Style_Upper.add("𝚅");
        Style_Upper.add("𝚆");
        Style_Upper.add("𝚇");
        Style_Upper.add("𝚈");
        Style_Upper.add("𝚉");

        Style_Lower.add("𝚊");
        Style_Lower.add("𝚋");
        Style_Lower.add("𝚌");
        Style_Lower.add("𝚍");
        Style_Lower.add("𝚎");
        Style_Lower.add("𝚏");
        Style_Lower.add("𝚐");
        Style_Lower.add("𝚑");
        Style_Lower.add("𝚒");
        Style_Lower.add("𝚓");
        Style_Lower.add("𝚔");
        Style_Lower.add("𝚕");
        Style_Lower.add("𝚖");
        Style_Lower.add("𝚗");
        Style_Lower.add("𝚘");
        Style_Lower.add("𝚙");
        Style_Lower.add("𝚚");
        Style_Lower.add("𝚛");
        Style_Lower.add("𝚜");
        Style_Lower.add("𝚝");
        Style_Lower.add("𝚞");
        Style_Lower.add("𝚟");
        Style_Lower.add("𝚠");
        Style_Lower.add("𝚡");
        Style_Lower.add("𝚢");
        Style_Lower.add("𝚣");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type7(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Upper.add("A̶");
        Style_Upper.add("B̶");
        Style_Upper.add("C̶");
        Style_Upper.add("D̶");
        Style_Upper.add("E̶");
        Style_Upper.add("F̶");
        Style_Upper.add("G̶");
        Style_Upper.add("H̶");
        Style_Upper.add("I̶");
        Style_Upper.add("J̶");
        Style_Upper.add("K̶");
        Style_Upper.add("L̶");
        Style_Upper.add("M̶");
        Style_Upper.add("N̶");
        Style_Upper.add("O̶");
        Style_Upper.add("P̶");
        Style_Upper.add("Q̶");
        Style_Upper.add("R̶");
        Style_Upper.add("S̶");
        Style_Upper.add("T̶");
        Style_Upper.add("U̶");
        Style_Upper.add("V̶");
        Style_Upper.add("W̶");
        Style_Upper.add("X̶");
        Style_Upper.add("Y̶");
        Style_Upper.add("Z̶");

        Style_Lower.add("a̶");
        Style_Lower.add("b̶");
        Style_Lower.add("c̶");
        Style_Lower.add("d̶");
        Style_Lower.add("e̶");
        Style_Lower.add("f̶");
        Style_Lower.add("g̶");
        Style_Lower.add("h̶");
        Style_Lower.add("i̶");
        Style_Lower.add("j̶");
        Style_Lower.add("k̶");
        Style_Lower.add("l̶");
        Style_Lower.add("m̶");
        Style_Lower.add("n̶");
        Style_Lower.add("o̶");
        Style_Lower.add("p̶̶");
        Style_Lower.add("q̶");
        Style_Lower.add("r̶");
        Style_Lower.add("s̶");
        Style_Lower.add("t̶");
        Style_Lower.add("u̶");
        Style_Lower.add("v̶");
        Style_Lower.add("w̶");
        Style_Lower.add("x̶");
        Style_Lower.add("y̶");
        Style_Lower.add("z̶");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type8(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("𝙖");
        Style_Lower.add("𝙗");
        Style_Lower.add("𝙘");
        Style_Lower.add("𝙙");
        Style_Lower.add("𝙚");
        Style_Lower.add("𝙛");
        Style_Lower.add("𝙜");
        Style_Lower.add("𝙝");
        Style_Lower.add("𝙞");
        Style_Lower.add("𝙟");
        Style_Lower.add("𝙠");
        Style_Lower.add("𝙡");
        Style_Lower.add("𝙢");
        Style_Lower.add("𝙣");
        Style_Lower.add("𝙤");
        Style_Lower.add("𝙥");
        Style_Lower.add("𝙦");
        Style_Lower.add("𝙧");
        Style_Lower.add("𝙨");
        Style_Lower.add("𝙩");
        Style_Lower.add("𝙪");
        Style_Lower.add("𝙫");
        Style_Lower.add("𝙬");
        Style_Lower.add("𝙭");
        Style_Lower.add("𝙮");
        Style_Lower.add("𝙯");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type9(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("𝐚");
        Style_Lower.add("𝐛");
        Style_Lower.add("𝐜");
        Style_Lower.add("𝐝");
        Style_Lower.add("𝐞");
        Style_Lower.add("𝐟");
        Style_Lower.add("𝐠");
        Style_Lower.add("𝐡");
        Style_Lower.add("𝐢");
        Style_Lower.add("𝐣");
        Style_Lower.add("𝐤");
        Style_Lower.add("𝐥");
        Style_Lower.add("𝐦");
        Style_Lower.add("𝐧");
        Style_Lower.add("𝐨");
        Style_Lower.add("𝐩");
        Style_Lower.add("𝐪");
        Style_Lower.add("𝐫");
        Style_Lower.add("𝐬");
        Style_Lower.add("𝐭");
        Style_Lower.add("𝐮");
        Style_Lower.add("𝐯");
        Style_Lower.add("𝐰");
        Style_Lower.add("𝐱");
        Style_Lower.add("𝐲");
        Style_Lower.add("𝐳");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type10(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("𝓪");
        Style_Lower.add("𝓫");
        Style_Lower.add("𝓬");
        Style_Lower.add("𝓭");
        Style_Lower.add("𝓮");
        Style_Lower.add("𝓯");
        Style_Lower.add("𝓰");
        Style_Lower.add("𝓱");
        Style_Lower.add("𝓲");
        Style_Lower.add("𝓳");
        Style_Lower.add("𝓴");
        Style_Lower.add("𝓵");
        Style_Lower.add("𝓶");
        Style_Lower.add("𝓷");
        Style_Lower.add("𝓸");
        Style_Lower.add("𝓹");
        Style_Lower.add("𝓺");
        Style_Lower.add("𝓻");
        Style_Lower.add("𝓼");
        Style_Lower.add("𝓽");
        Style_Lower.add("𝓾");
        Style_Lower.add("𝓿");
        Style_Lower.add("𝔀");
        Style_Lower.add("𝔁");
        Style_Lower.add("𝔂");
        Style_Lower.add("𝔃");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type11(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("𝖆");
        Style_Lower.add("𝖇");
        Style_Lower.add("𝖈");
        Style_Lower.add("𝖉");
        Style_Lower.add("𝖊");
        Style_Lower.add("𝖋");
        Style_Lower.add("𝖌");
        Style_Lower.add("𝖍");
        Style_Lower.add("𝖎");
        Style_Lower.add("𝖏");
        Style_Lower.add("𝖐");
        Style_Lower.add("𝖑");
        Style_Lower.add("𝖒");
        Style_Lower.add("𝖓");
        Style_Lower.add("𝖔");
        Style_Lower.add("𝖕");
        Style_Lower.add("𝖖");
        Style_Lower.add("𝖗");
        Style_Lower.add("𝖘");
        Style_Lower.add("𝖙");
        Style_Lower.add("𝖚");
        Style_Lower.add("𝖛");
        Style_Lower.add("𝖜");
        Style_Lower.add("𝖝");
        Style_Lower.add("𝖞");
        Style_Lower.add("𝖟");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type12(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("𝗮");
        Style_Lower.add("𝗯");
        Style_Lower.add("𝗰");
        Style_Lower.add("𝗱");
        Style_Lower.add("𝗲");
        Style_Lower.add("𝗳");
        Style_Lower.add("𝗴");
        Style_Lower.add("𝗵");
        Style_Lower.add("𝗶");
        Style_Lower.add("𝗷");
        Style_Lower.add("𝗸");
        Style_Lower.add("𝗹");
        Style_Lower.add("𝗺");
        Style_Lower.add("𝗻");
        Style_Lower.add("𝗼");
        Style_Lower.add("𝗽");
        Style_Lower.add("𝗾");
        Style_Lower.add("𝗿");
        Style_Lower.add("𝘀");
        Style_Lower.add("𝘁");
        Style_Lower.add("𝘂");
        Style_Lower.add("𝘃");
        Style_Lower.add("𝘄");
        Style_Lower.add("𝘅");
        Style_Lower.add("𝘆");
        Style_Lower.add("𝘇");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type13(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("𝘢");
        Style_Lower.add("𝘣");
        Style_Lower.add("𝘤");
        Style_Lower.add("𝘥");
        Style_Lower.add("𝘦");
        Style_Lower.add("𝘧");
        Style_Lower.add("𝘨");
        Style_Lower.add("𝘩");
        Style_Lower.add("𝘪");
        Style_Lower.add("𝘫");
        Style_Lower.add("𝘬");
        Style_Lower.add("𝘭");
        Style_Lower.add("𝘮");
        Style_Lower.add("𝘯");
        Style_Lower.add("𝘰");
        Style_Lower.add("𝘱");
        Style_Lower.add("𝘲");
        Style_Lower.add("𝘳");
        Style_Lower.add("𝘴");
        Style_Lower.add("𝘵");
        Style_Lower.add("𝘶");
        Style_Lower.add("𝘷");
        Style_Lower.add("𝘸");
        Style_Lower.add("𝘹");
        Style_Lower.add("𝘺");
        Style_Lower.add("𝘻");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type14(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("𝚊");
        Style_Lower.add("𝚋");
        Style_Lower.add("𝚌");
        Style_Lower.add("𝚍");
        Style_Lower.add("𝚎");
        Style_Lower.add("𝚏");
        Style_Lower.add("𝚐");
        Style_Lower.add("𝚑");
        Style_Lower.add("𝚒");
        Style_Lower.add("𝚓");
        Style_Lower.add("𝚔");
        Style_Lower.add("𝚕");
        Style_Lower.add("𝚖");
        Style_Lower.add("𝚗");
        Style_Lower.add("𝚘");
        Style_Lower.add("𝚙");
        Style_Lower.add("𝚚");
        Style_Lower.add("𝚛");
        Style_Lower.add("𝚜");
        Style_Lower.add("𝚝");
        Style_Lower.add("𝚞");
        Style_Lower.add("𝚟");
        Style_Lower.add("𝚠");
        Style_Lower.add("𝚡");
        Style_Lower.add("𝚢");
        Style_Lower.add("𝚣");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type15(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("ⓐ");
        Style_Lower.add("ⓑ");
        Style_Lower.add("ⓒ");
        Style_Lower.add("ⓓ");
        Style_Lower.add("ⓔ");
        Style_Lower.add("ⓕ");
        Style_Lower.add("ⓖ");
        Style_Lower.add("ⓗ");
        Style_Lower.add("ⓘ");
        Style_Lower.add("ⓙ");
        Style_Lower.add("ⓚ");
        Style_Lower.add("ⓛ");
        Style_Lower.add("ⓜ");
        Style_Lower.add("ⓝ");
        Style_Lower.add("ⓞ");
        Style_Lower.add("ⓟ");
        Style_Lower.add("ⓠ");
        Style_Lower.add("ⓡ");
        Style_Lower.add("ⓢ");
        Style_Lower.add("ⓣ");
        Style_Lower.add("ⓤ");
        Style_Lower.add("ⓥ");
        Style_Lower.add("ⓦ");
        Style_Lower.add("ⓧ");
        Style_Lower.add("ⓨ");
        Style_Lower.add("ⓩ");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type16(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("a̸");
        Style_Lower.add("b̸");
        Style_Lower.add("c̸");
        Style_Lower.add("d̸");
        Style_Lower.add("e̸");
        Style_Lower.add("f̸");
        Style_Lower.add("g̸");
        Style_Lower.add("h̸");
        Style_Lower.add("i̸");
        Style_Lower.add("j̸");
        Style_Lower.add("k̸");
        Style_Lower.add("l̸");
        Style_Lower.add("m̸");
        Style_Lower.add("n̸");
        Style_Lower.add("o̸");
        Style_Lower.add("p̸");
        Style_Lower.add("q̸");
        Style_Lower.add("r̸");
        Style_Lower.add("s̸");
        Style_Lower.add("t̸");
        Style_Lower.add("u̸");
        Style_Lower.add("v̸");
        Style_Lower.add("w̸");
        Style_Lower.add("x̸");
        Style_Lower.add("y̸");
        Style_Lower.add("z̸");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type17(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("a꯭");
        Style_Lower.add("b꯭");
        Style_Lower.add("c꯭");
        Style_Lower.add("d꯭");
        Style_Lower.add("e꯭");
        Style_Lower.add("f꯭");
        Style_Lower.add("g꯭");
        Style_Lower.add("h꯭");
        Style_Lower.add("i꯭");
        Style_Lower.add("j꯭");
        Style_Lower.add("k꯭");
        Style_Lower.add("l꯭");
        Style_Lower.add("m꯭");
        Style_Lower.add("n꯭");
        Style_Lower.add("o꯭");
        Style_Lower.add("p꯭");
        Style_Lower.add("q꯭");
        Style_Lower.add("r꯭");
        Style_Lower.add("s꯭");
        Style_Lower.add("t꯭");
        Style_Lower.add("u꯭");
        Style_Lower.add("v꯭");
        Style_Lower.add("w꯭");
        Style_Lower.add("x꯭");
        Style_Lower.add("y꯭");
        Style_Lower.add("z꯭");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type18(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();

        Style_Upper.add("🄐");
        Style_Upper.add("🄑");
        Style_Upper.add("🄒");
        Style_Upper.add("🄓");
        Style_Upper.add("🄔");
        Style_Upper.add("🄕");
        Style_Upper.add("🄖");
        Style_Upper.add("🄗");
        Style_Upper.add("🄘");
        Style_Upper.add("🄙");
        Style_Upper.add("🄚");
        Style_Upper.add("🄛");
        Style_Upper.add("🄜");
        Style_Upper.add("🄝");
        Style_Upper.add("🄞");
        Style_Upper.add("🄟");
        Style_Upper.add("🄠");
        Style_Upper.add("🄡");
        Style_Upper.add("🄢");
        Style_Upper.add("🄣");
        Style_Upper.add("🄤");
        Style_Upper.add("🄥");
        Style_Upper.add("🄦");
        Style_Upper.add("🄧");
        Style_Upper.add("🄨");
        Style_Upper.add("🄩");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Upper.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type19(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();

        Style_Upper.add("🄰");
        Style_Upper.add("🄱");
        Style_Upper.add("🄲");
        Style_Upper.add("🄳");
        Style_Upper.add("🄴");
        Style_Upper.add("🄵");
        Style_Upper.add("🄶");
        Style_Upper.add("🄷");
        Style_Upper.add("🄸");
        Style_Upper.add("🄹");
        Style_Upper.add("🄺");
        Style_Upper.add("🄻");
        Style_Upper.add("🄼");
        Style_Upper.add("🄽");
        Style_Upper.add("🄾");
        Style_Upper.add("🄿");
        Style_Upper.add("🅀");
        Style_Upper.add("🅁");
        Style_Upper.add("🅂");
        Style_Upper.add("🅃");
        Style_Upper.add("🅄");
        Style_Upper.add("🅅");
        Style_Upper.add("🅆");
        Style_Upper.add("🅇");
        Style_Upper.add("🅈");
        Style_Upper.add("🅉");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Upper.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type20(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();

        Style_Upper.add("🅐");
        Style_Upper.add("🅑");
        Style_Upper.add("🅒");
        Style_Upper.add("🅓");
        Style_Upper.add("🅔");
        Style_Upper.add("🅕");
        Style_Upper.add("🅖");
        Style_Upper.add("🅗");
        Style_Upper.add("🅘");
        Style_Upper.add("🅙");
        Style_Upper.add("🅚");
        Style_Upper.add("🅛");
        Style_Upper.add("🅜");
        Style_Upper.add("🅝");
        Style_Upper.add("🅞");
        Style_Upper.add("🅟");
        Style_Upper.add("🅠");
        Style_Upper.add("🅡");
        Style_Upper.add("🅢");
        Style_Upper.add("🅣");
        Style_Upper.add("🅤");
        Style_Upper.add("🅥");
        Style_Upper.add("🅦");
        Style_Upper.add("🅧");
        Style_Upper.add("🅨");
        Style_Upper.add("🅩");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Upper.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type20(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();

        Style_Upper.add("🅰️");
        Style_Upper.add("🅱️");
        Style_Upper.add("🅲");
        Style_Upper.add("🅳");
        Style_Upper.add("🅴");
        Style_Upper.add("🅵");
        Style_Upper.add("🅶");
        Style_Upper.add("🅷");
        Style_Upper.add("🅸");
        Style_Upper.add("🅹");
        Style_Upper.add("🅺");
        Style_Upper.add("🅻");
        Style_Upper.add("🅼");
        Style_Upper.add("🅽");
        Style_Upper.add("🅾️");
        Style_Upper.add("🅿️");
        Style_Upper.add("🆀");
        Style_Upper.add("🆁");
        Style_Upper.add("🆂");
        Style_Upper.add("🆃");
        Style_Upper.add("🆄");
        Style_Upper.add("🆅");
        Style_Upper.add("🆆");
        Style_Upper.add("🆇");
        Style_Upper.add("🆈");
        Style_Upper.add("🆉");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Upper.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type21(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();

        Style_Upper.add("Λ");
        Style_Upper.add("ß");
        Style_Upper.add("₡");
        Style_Upper.add("Ð");
        Style_Upper.add("Ξ");
        Style_Upper.add("Ŧ");
        Style_Upper.add("G");
        Style_Upper.add("Ħ");
        Style_Upper.add("Ї");
        Style_Upper.add("J");
        Style_Upper.add("К");
        Style_Upper.add("Ł");
        Style_Upper.add("M");
        Style_Upper.add("Ñ");
        Style_Upper.add("Θ");
        Style_Upper.add("P");
        Style_Upper.add("Q");
        Style_Upper.add("Я");
        Style_Upper.add("§");
        Style_Upper.add("T");
        Style_Upper.add("Ц");
        Style_Upper.add("V");
        Style_Upper.add("₩");
        Style_Upper.add("Ж");
        Style_Upper.add("¥");
        Style_Upper.add("Z");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Upper.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type22(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();

        Style_Upper.add("ⓐ");
        Style_Upper.add("ⓑ");
        Style_Upper.add("ⓒ");
        Style_Upper.add("ⓓ");
        Style_Upper.add("ⓔ");
        Style_Upper.add("ⓕ");
        Style_Upper.add("ⓖ");
        Style_Upper.add("ⓗ");
        Style_Upper.add("ⓘ");
        Style_Upper.add("ⓙ");
        Style_Upper.add("ⓚ");
        Style_Upper.add("ⓛ");
        Style_Upper.add("ⓜ");
        Style_Upper.add("ⓝ");
        Style_Upper.add("ⓞ");
        Style_Upper.add("ⓟ");
        Style_Upper.add("ⓠ");
        Style_Upper.add("ⓡ");
        Style_Upper.add("ⓢ");
        Style_Upper.add("ⓣ");
        Style_Upper.add("ⓤ");
        Style_Upper.add("ⓥ");
        Style_Upper.add("ⓦ");
        Style_Upper.add("ⓧ");
        Style_Upper.add("ⓨ");
        Style_Upper.add("ⓩ");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Upper.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type23(String string_in) {
        ArrayList<String> Style_Upper = new ArrayList<>();

        Style_Upper.add("Ʌ");
        Style_Upper.add("Ɓ");
        Style_Upper.add("Ȼ");
        Style_Upper.add("Ɗ");
        Style_Upper.add("Ƹ");
        Style_Upper.add("Ƒ");
        Style_Upper.add("Ɠ");
        Style_Upper.add("Ƕ");
        Style_Upper.add("Ɨ");
        Style_Upper.add("J");
        Style_Upper.add("Ƙ");
        Style_Upper.add("Ł");
        Style_Upper.add("M");
        Style_Upper.add("Ɲ");
        Style_Upper.add("Ȏ");
        Style_Upper.add("Ƥ");
        Style_Upper.add("Ǫ");
        Style_Upper.add("Ʀ");
        Style_Upper.add("Ŝ");
        Style_Upper.add("Ⱦ");
        Style_Upper.add("Ư");
        Style_Upper.add("Ѵ");
        Style_Upper.add("W");
        Style_Upper.add("X");
        Style_Upper.add("Ɏ");
        Style_Upper.add("Ȥ");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Style_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Style_Upper.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type24(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("ค");
        Style_Lower.add("Ъ");
        Style_Lower.add("c");
        Style_Lower.add("d");
        Style_Lower.add("ε");
        Style_Lower.add("ƒ");
        Style_Lower.add("g");
        Style_Lower.add("ʜ");
        Style_Lower.add("¡");
        Style_Lower.add("j");
        Style_Lower.add("к");
        Style_Lower.add("ł");
        Style_Lower.add("ɱ");
        Style_Lower.add("ห");
        Style_Lower.add("σ");
        Style_Lower.add("p");
        Style_Lower.add("q");
        Style_Lower.add("я");
        Style_Lower.add("ร");
        Style_Lower.add("t");
        Style_Lower.add("u");
        Style_Lower.add("v");
        Style_Lower.add("ω");
        Style_Lower.add("x");
        Style_Lower.add("ყ");
        Style_Lower.add("z");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type25(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("α");
        Style_Lower.add("в");
        Style_Lower.add("c");
        Style_Lower.add("∂");
        Style_Lower.add("є");
        Style_Lower.add("ƒ");
        Style_Lower.add("g");
        Style_Lower.add("н");
        Style_Lower.add("ι");
        Style_Lower.add("נ");
        Style_Lower.add("к");
        Style_Lower.add("ℓ");
        Style_Lower.add("м");
        Style_Lower.add("η");
        Style_Lower.add("ø");
        Style_Lower.add("ρ");
        Style_Lower.add("q");
        Style_Lower.add("ɾ");
        Style_Lower.add("š");
        Style_Lower.add("т");
        Style_Lower.add("υ");
        Style_Lower.add("v");
        Style_Lower.add("ω");
        Style_Lower.add("χ");
        Style_Lower.add("ч");
        Style_Lower.add("z");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type26(String string_in) {
        ArrayList<String> Style_Lower = new ArrayList<>();

        Style_Lower.add("ɐ");
        Style_Lower.add("q");
        Style_Lower.add("ɔ");
        Style_Lower.add("p");
        Style_Lower.add("ə");
        Style_Lower.add("ɟ");
        Style_Lower.add("ɓ");
        Style_Lower.add("ɥ");
        Style_Lower.add("ı");
        Style_Lower.add("ɾ");
        Style_Lower.add("ʞ");
        Style_Lower.add("l");
        Style_Lower.add("ɯ");
        Style_Lower.add("u");
        Style_Lower.add("o");
        Style_Lower.add("d");
        Style_Lower.add("b");
        Style_Lower.add("ɹ");
        Style_Lower.add("s");
        Style_Lower.add("ʇ");
        Style_Lower.add("n");
        Style_Lower.add("ʌ");
        Style_Lower.add("ʍ");
        Style_Lower.add("x");
        Style_Lower.add("ʎ");
        Style_Lower.add("z");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Style_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }





}







Style_Lower.add("ค");
Style_Lower.add("๖");
Style_Lower.add("¢");
Style_Lower.add("ɗ");
Style_Lower.add("ε");
Style_Lower.add("ƒ");
Style_Lower.add("g");
Style_Lower.add("h");
Style_Lower.add("i");
Style_Lower.add("ว");
Style_Lower.add("k");
Style_Lower.add("l");
Style_Lower.add("๓");
Style_Lower.add("n");
Style_Lower.add("o");
Style_Lower.add("ρ");
Style_Lower.add("q");
Style_Lower.add("ɾ");
Style_Lower.add("s");
Style_Lower.add("t");
Style_Lower.add("น");
Style_Lower.add("ง");
Style_Lower.add("ω");
Style_Lower.add("x");
Style_Lower.add("ฯ");
Style_Lower.add("z");


Style_Lower.add("α");
Style_Lower.add("b");
Style_Lower.add("c");
Style_Lower.add("ɗ");
Style_Lower.add("є");
Style_Lower.add("ƒ");
Style_Lower.add("g");
Style_Lower.add("h");
Style_Lower.add("ı");
Style_Lower.add("ȷ");
Style_Lower.add("k");
Style_Lower.add("ɭ");
Style_Lower.add("m");
Style_Lower.add("η");
Style_Lower.add("σ");
Style_Lower.add("ρ");
Style_Lower.add("q");
Style_Lower.add("r");
Style_Lower.add("s");
Style_Lower.add("t");
Style_Lower.add("υ");
Style_Lower.add("ѵ");
Style_Lower.add("ω");
Style_Lower.add("x");
Style_Lower.add("y");
Style_Lower.add("ર");


Style_Lower.add("ค");
Style_Lower.add("๒");
Style_Lower.add("ς");
Style_Lower.add("๔");
Style_Lower.add("є");
Style_Lower.add("Ŧ");
Style_Lower.add("ﻮ");
Style_Lower.add("ђ");
Style_Lower.add("เ");
Style_Lower.add("ן");
Style_Lower.add("к");
Style_Lower.add("l");
Style_Lower.add("๓");
Style_Lower.add("ภ");
Style_Lower.add("๏");
Style_Lower.add("ק");
Style_Lower.add("ợ");
Style_Lower.add("г");
Style_Lower.add("ร");
Style_Lower.add("t");
Style_Lower.add("ย");
Style_Lower.add("ש");
Style_Lower.add("ฬ");
Style_Lower.add("א");
Style_Lower.add("ץ");
Style_Lower.add("z");


Style_Lower.add("å");
Style_Lower.add("β");
Style_Lower.add("ç");
Style_Lower.add("ď");
Style_Lower.add("£");
Style_Lower.add("ƒ");
Style_Lower.add("ğ");
Style_Lower.add("Ћ");
Style_Lower.add("!");
Style_Lower.add("j");
Style_Lower.add("ķ");
Style_Lower.add("Ł");
Style_Lower.add("๓");
Style_Lower.add("ñ");
Style_Lower.add("¤");
Style_Lower.add("ק");
Style_Lower.add("ợ");
Style_Lower.add("ř");
Style_Lower.add("§");
Style_Lower.add("†");
Style_Lower.add("µ");
Style_Lower.add("√");
Style_Lower.add("Ψ");
Style_Lower.add("×");
Style_Lower.add("ÿ");
Style_Lower.add("ž");


Style_Lower.add("ᴀ");
Style_Lower.add("ʙ");
Style_Lower.add("ᴄ");
Style_Lower.add("ᴅ");
Style_Lower.add("ᴇ");
Style_Lower.add("ғ");
Style_Lower.add("ɢ");
Style_Lower.add("ʜ");
Style_Lower.add("ɪ");
Style_Lower.add("ᴊ");
Style_Lower.add("ᴋ");
Style_Lower.add("ʟ");
Style_Lower.add("ᴍ");
Style_Lower.add("ɴ");
Style_Lower.add("ᴏ");
Style_Lower.add("ᴘ");
Style_Lower.add("ǫ");
Style_Lower.add("ʀ");
Style_Lower.add("ꜱ");
Style_Lower.add("ᴛ");
Style_Lower.add("ᴜ");
Style_Lower.add("ᴠ");
Style_Lower.add("ᴡ");
Style_Lower.add("x");
Style_Lower.add("ʏ");
Style_Lower.add("ᴢ");


Style_Lower.add("ά");
Style_Lower.add("в");
Style_Lower.add("ς");
Style_Lower.add("∂");
Style_Lower.add("έ");
Style_Lower.add("ғ");
Style_Lower.add("ģ");
Style_Lower.add("ħ");
Style_Lower.add("ί");
Style_Lower.add("ј");
Style_Lower.add("ķ");
Style_Lower.add("Ļ");
Style_Lower.add("м");
Style_Lower.add("ή");
Style_Lower.add("ό");
Style_Lower.add("ρ");
Style_Lower.add("q");
Style_Lower.add("ŕ");
Style_Lower.add("ş");
Style_Lower.add("ţ");
Style_Lower.add("ù");
Style_Lower.add("ν");
Style_Lower.add("ώ");
Style_Lower.add("x");
Style_Lower.add("ч");
Style_Lower.add("ž");


Style_Lower.add("Д");
Style_Lower.add("þ");
Style_Lower.add("¢");
Style_Lower.add("Ð");
Style_Lower.add("3");
Style_Lower.add("ƒ");
Style_Lower.add("g");
Style_Lower.add("ђ");
Style_Lower.add("î");
Style_Lower.add("j");
Style_Lower.add("k");
Style_Lower.add("ℓ");
Style_Lower.add("м");
Style_Lower.add("₪");
Style_Lower.add("ø");
Style_Lower.add("Þ");
Style_Lower.add("Q");
Style_Lower.add("Я");
Style_Lower.add("§");
Style_Lower.add("†");
Style_Lower.add("û");
Style_Lower.add("√");
Style_Lower.add("w");
Style_Lower.add("×");
Style_Lower.add("¥");
Style_Lower.add("ž");


Style_Lower.add("a");
Style_Lower.add("b");
Style_Lower.add("ς");
Style_Lower.add("d");
Style_Lower.add("є");
Style_Lower.add("Ŧ");
Style_Lower.add("ﻮ");
Style_Lower.add("ђ");
Style_Lower.add("i");
Style_Lower.add("j");
Style_Lower.add("к");
Style_Lower.add("l");
Style_Lower.add("m");
Style_Lower.add("n");
Style_Lower.add("o");
Style_Lower.add("ק");
Style_Lower.add("ợ");
Style_Lower.add("г");
Style_Lower.add("s");
Style_Lower.add("t");
Style_Lower.add("u");
Style_Lower.add("ש");
Style_Lower.add("w");
Style_Lower.add("ץ");
Style_Lower.add("א");
Style_Lower.add("z");


Style_Lower.add("Λ");
Style_Lower.add("B");
Style_Lower.add("C");
Style_Lower.add("D");
Style_Lower.add("Σ");
Style_Lower.add("F");
Style_Lower.add("G");
Style_Lower.add("Ή");
Style_Lower.add("I");
Style_Lower.add("J");
Style_Lower.add("K");
Style_Lower.add("L");
Style_Lower.add("M");
Style_Lower.add("П");
Style_Lower.add("Ө");
Style_Lower.add("P");
Style_Lower.add("Q");
Style_Lower.add("Я");
Style_Lower.add("S");
Style_Lower.add("Ŧ");
Style_Lower.add("Ц");
Style_Lower.add("V");
Style_Lower.add("Щ");
Style_Lower.add("X");
Style_Lower.add("Y");
Style_Lower.add("Z");


Style_Lower.add("ą");
Style_Lower.add("β");
Style_Lower.add("č");
Style_Lower.add("ď");
Style_Lower.add("€");
Style_Lower.add("ƒ");
Style_Lower.add("δ");
Style_Lower.add("Ђ");
Style_Lower.add("ί");
Style_Lower.add("j");
Style_Lower.add("Ќ");
Style_Lower.add("ℓ");
Style_Lower.add("๓");
Style_Lower.add("ŋ");
Style_Lower.add("๏");
Style_Lower.add("ρ");
Style_Lower.add("ợ");
Style_Lower.add("я");
Style_Lower.add("$");
Style_Lower.add("ţ");
Style_Lower.add("µ");
Style_Lower.add("ѵ");
Style_Lower.add("ώ");
Style_Lower.add("ж");
Style_Lower.add("¥");
Style_Lower.add("ź");


Style_Lower.add("∆");
Style_Lower.add("б");
Style_Lower.add("ς");
Style_Lower.add("∂");
Style_Lower.add("∑");
Style_Lower.add("ﾓ");
Style_Lower.add("б");
Style_Lower.add("ｻ");
Style_Lower.add("ⅰ");
Style_Lower.add("ﾉ");
Style_Lower.add("к");
Style_Lower.add("ﾚ");
Style_Lower.add("㎡");
Style_Lower.add("и");
Style_Lower.add("◊");
Style_Lower.add("ㄕ");
Style_Lower.add("q");
Style_Lower.add("Я");
Style_Lower.add("ㄅ");
Style_Lower.add("₮");
Style_Lower.add("ㄩ");
Style_Lower.add("√");
Style_Lower.add("w");
Style_Lower.add("×");
Style_Lower.add("ㄚ");
Style_Lower.add("z");
