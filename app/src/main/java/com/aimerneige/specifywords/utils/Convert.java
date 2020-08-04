package com.aimerneige.specifywords.utils;

import java.util.ArrayList;

// Convert input string
public class Convert {

    // test done
    public static String convert2Copperplate(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("𝓐");
        Copperplate_Upper.add("𝓑");
        Copperplate_Upper.add("𝓒");
        Copperplate_Upper.add("𝓓");
        Copperplate_Upper.add("𝓔");
        Copperplate_Upper.add("𝓕");
        Copperplate_Upper.add("𝓖");
        Copperplate_Upper.add("𝓗");
        Copperplate_Upper.add("𝓘");
        Copperplate_Upper.add("𝓙");
        Copperplate_Upper.add("𝓚");
        Copperplate_Upper.add("𝓛");
        Copperplate_Upper.add("𝓜");
        Copperplate_Upper.add("𝓝");
        Copperplate_Upper.add("𝓞");
        Copperplate_Upper.add("𝓟");
        Copperplate_Upper.add("𝓠");
        Copperplate_Upper.add("𝓡");
        Copperplate_Upper.add("𝓢");
        Copperplate_Upper.add("𝓣");
        Copperplate_Upper.add("𝓤");
        Copperplate_Upper.add("𝓥");
        Copperplate_Upper.add("𝓦");
        Copperplate_Upper.add("𝓧");
        Copperplate_Upper.add("𝓨");
        Copperplate_Upper.add("𝓩");

        Copperplate_Lower.add("𝓪");
        Copperplate_Lower.add("𝓫");
        Copperplate_Lower.add("𝓬");
        Copperplate_Lower.add("𝓭");
        Copperplate_Lower.add("𝓮");
        Copperplate_Lower.add("𝓯");
        Copperplate_Lower.add("𝓰");
        Copperplate_Lower.add("𝓱");
        Copperplate_Lower.add("𝓲");
        Copperplate_Lower.add("𝓳");
        Copperplate_Lower.add("𝓴");
        Copperplate_Lower.add("𝓵");
        Copperplate_Lower.add("𝓶");
        Copperplate_Lower.add("𝓷");
        Copperplate_Lower.add("𝓸");
        Copperplate_Lower.add("𝓹");
        Copperplate_Lower.add("𝓺");
        Copperplate_Lower.add("𝓻");
        Copperplate_Lower.add("𝓼");
        Copperplate_Lower.add("𝓽");
        Copperplate_Lower.add("𝓾");
        Copperplate_Lower.add("𝓿");
        Copperplate_Lower.add("𝔀");
        Copperplate_Lower.add("𝔁");
        Copperplate_Lower.add("𝔂");
        Copperplate_Lower.add("𝔃");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type1(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("𝐀");
        Copperplate_Upper.add("𝐁");
        Copperplate_Upper.add("𝐂");
        Copperplate_Upper.add("𝐃");
        Copperplate_Upper.add("𝐄");
        Copperplate_Upper.add("𝐅");
        Copperplate_Upper.add("𝐆");
        Copperplate_Upper.add("𝐇");
        Copperplate_Upper.add("𝐈");
        Copperplate_Upper.add("𝐉");
        Copperplate_Upper.add("𝐊");
        Copperplate_Upper.add("𝐋");
        Copperplate_Upper.add("𝐌");
        Copperplate_Upper.add("𝐍");
        Copperplate_Upper.add("𝐎");
        Copperplate_Upper.add("𝐏");
        Copperplate_Upper.add("𝐐");
        Copperplate_Upper.add("𝐑");
        Copperplate_Upper.add("𝐒");
        Copperplate_Upper.add("𝐓");
        Copperplate_Upper.add("𝐔");
        Copperplate_Upper.add("𝐕");
        Copperplate_Upper.add("𝐖");
        Copperplate_Upper.add("𝐗");
        Copperplate_Upper.add("𝐘");
        Copperplate_Upper.add("𝐙");

        Copperplate_Lower.add("𝐚");
        Copperplate_Lower.add("𝐛");
        Copperplate_Lower.add("𝐜");
        Copperplate_Lower.add("𝐝");
        Copperplate_Lower.add("𝐞");
        Copperplate_Lower.add("𝐟");
        Copperplate_Lower.add("𝐠");
        Copperplate_Lower.add("𝐡");
        Copperplate_Lower.add("𝐢");
        Copperplate_Lower.add("𝐣");
        Copperplate_Lower.add("𝐤");
        Copperplate_Lower.add("𝐥");
        Copperplate_Lower.add("𝐦");
        Copperplate_Lower.add("𝐧");
        Copperplate_Lower.add("𝐨");
        Copperplate_Lower.add("𝐩");
        Copperplate_Lower.add("𝐪");
        Copperplate_Lower.add("𝐫");
        Copperplate_Lower.add("𝐬");
        Copperplate_Lower.add("𝐭");
        Copperplate_Lower.add("𝐮");
        Copperplate_Lower.add("𝐯");
        Copperplate_Lower.add("𝐰");
        Copperplate_Lower.add("𝐱");
        Copperplate_Lower.add("𝐲");
        Copperplate_Lower.add("𝐳");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type2(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("𝗔");
        Copperplate_Upper.add("𝗕");
        Copperplate_Upper.add("𝗖");
        Copperplate_Upper.add("𝗗");
        Copperplate_Upper.add("𝗘");
        Copperplate_Upper.add("𝗙");
        Copperplate_Upper.add("𝗚");
        Copperplate_Upper.add("𝗛");
        Copperplate_Upper.add("𝗜");
        Copperplate_Upper.add("𝗝");
        Copperplate_Upper.add("𝗞");
        Copperplate_Upper.add("𝗟");
        Copperplate_Upper.add("𝗠");
        Copperplate_Upper.add("𝗡");
        Copperplate_Upper.add("𝗢");
        Copperplate_Upper.add("𝗣");
        Copperplate_Upper.add("𝗤");
        Copperplate_Upper.add("𝗥");
        Copperplate_Upper.add("𝗦");
        Copperplate_Upper.add("𝗧");
        Copperplate_Upper.add("𝗨");
        Copperplate_Upper.add("𝗩");
        Copperplate_Upper.add("𝗪");
        Copperplate_Upper.add("𝗫");
        Copperplate_Upper.add("𝗬");
        Copperplate_Upper.add("𝗭");

        Copperplate_Lower.add("𝗮");
        Copperplate_Lower.add("𝗯");
        Copperplate_Lower.add("𝗰");
        Copperplate_Lower.add("𝗱");
        Copperplate_Lower.add("𝗲");
        Copperplate_Lower.add("𝗳");
        Copperplate_Lower.add("𝗴");
        Copperplate_Lower.add("𝗵");
        Copperplate_Lower.add("𝗶");
        Copperplate_Lower.add("𝗷");
        Copperplate_Lower.add("𝗸");
        Copperplate_Lower.add("𝗹");
        Copperplate_Lower.add("𝗺");
        Copperplate_Lower.add("𝗻");
        Copperplate_Lower.add("𝗼");
        Copperplate_Lower.add("𝗽");
        Copperplate_Lower.add("𝗾");
        Copperplate_Lower.add("𝗿");
        Copperplate_Lower.add("𝘀");
        Copperplate_Lower.add("𝘁");
        Copperplate_Lower.add("𝘂");
        Copperplate_Lower.add("𝘃");
        Copperplate_Lower.add("𝘄");
        Copperplate_Lower.add("𝘅");
        Copperplate_Lower.add("𝘆");
        Copperplate_Lower.add("𝘇");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type3(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("𝘈");
        Copperplate_Upper.add("𝘉");
        Copperplate_Upper.add("𝘊");
        Copperplate_Upper.add("𝘋");
        Copperplate_Upper.add("𝘌");
        Copperplate_Upper.add("𝘍");
        Copperplate_Upper.add("𝘎");
        Copperplate_Upper.add("𝘏");
        Copperplate_Upper.add("𝘐");
        Copperplate_Upper.add("𝘑");
        Copperplate_Upper.add("𝘒");
        Copperplate_Upper.add("𝘓");
        Copperplate_Upper.add("𝘔");
        Copperplate_Upper.add("𝘕");
        Copperplate_Upper.add("𝘖");
        Copperplate_Upper.add("𝘗");
        Copperplate_Upper.add("𝘘");
        Copperplate_Upper.add("𝘙");
        Copperplate_Upper.add("𝘚");
        Copperplate_Upper.add("𝘛");
        Copperplate_Upper.add("𝘜");
        Copperplate_Upper.add("𝘝");
        Copperplate_Upper.add("𝘞");
        Copperplate_Upper.add("𝘟");
        Copperplate_Upper.add("𝘠");
        Copperplate_Upper.add("𝘡");

        Copperplate_Lower.add("𝘢");
        Copperplate_Lower.add("𝘣");
        Copperplate_Lower.add("𝘤");
        Copperplate_Lower.add("𝘥");
        Copperplate_Lower.add("𝘦");
        Copperplate_Lower.add("𝘧");
        Copperplate_Lower.add("𝘨");
        Copperplate_Lower.add("𝘩");
        Copperplate_Lower.add("𝘪");
        Copperplate_Lower.add("𝘫");
        Copperplate_Lower.add("𝘬");
        Copperplate_Lower.add("𝘭");
        Copperplate_Lower.add("𝘮");
        Copperplate_Lower.add("𝘯");
        Copperplate_Lower.add("𝘰");
        Copperplate_Lower.add("𝘱");
        Copperplate_Lower.add("𝘲");
        Copperplate_Lower.add("𝘳");
        Copperplate_Lower.add("𝘴");
        Copperplate_Lower.add("𝘵");
        Copperplate_Lower.add("𝘶");
        Copperplate_Lower.add("𝘷");
        Copperplate_Lower.add("𝘸");
        Copperplate_Lower.add("𝘹");
        Copperplate_Lower.add("𝘺");
        Copperplate_Lower.add("𝘻");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type4(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("𝘼");
        Copperplate_Upper.add("𝘽");
        Copperplate_Upper.add("𝘾");
        Copperplate_Upper.add("𝘿");
        Copperplate_Upper.add("𝙀");
        Copperplate_Upper.add("𝙁");
        Copperplate_Upper.add("𝙂");
        Copperplate_Upper.add("𝙃");
        Copperplate_Upper.add("𝙄");
        Copperplate_Upper.add("𝙅");
        Copperplate_Upper.add("𝙆");
        Copperplate_Upper.add("𝙇");
        Copperplate_Upper.add("𝙈");
        Copperplate_Upper.add("𝙉");
        Copperplate_Upper.add("𝙊");
        Copperplate_Upper.add("𝙋");
        Copperplate_Upper.add("𝙌");
        Copperplate_Upper.add("𝙍");
        Copperplate_Upper.add("𝙎");
        Copperplate_Upper.add("𝙏");
        Copperplate_Upper.add("𝙐");
        Copperplate_Upper.add("𝙑");
        Copperplate_Upper.add("𝙒");
        Copperplate_Upper.add("𝙓");
        Copperplate_Upper.add("𝙔");
        Copperplate_Upper.add("𝙕");

        Copperplate_Lower.add("𝙖");
        Copperplate_Lower.add("𝙗");
        Copperplate_Lower.add("𝙘");
        Copperplate_Lower.add("𝙙");
        Copperplate_Lower.add("𝙚");
        Copperplate_Lower.add("𝙛");
        Copperplate_Lower.add("𝙜");
        Copperplate_Lower.add("𝙝");
        Copperplate_Lower.add("𝙞");
        Copperplate_Lower.add("𝙟");
        Copperplate_Lower.add("𝙠");
        Copperplate_Lower.add("𝙡");
        Copperplate_Lower.add("𝙢");
        Copperplate_Lower.add("𝙣");
        Copperplate_Lower.add("𝙤");
        Copperplate_Lower.add("𝙥");
        Copperplate_Lower.add("𝙦");
        Copperplate_Lower.add("𝙧");
        Copperplate_Lower.add("𝙨");
        Copperplate_Lower.add("𝙩");
        Copperplate_Lower.add("𝙪");
        Copperplate_Lower.add("𝙫");
        Copperplate_Lower.add("𝙬");
        Copperplate_Lower.add("𝙭");
        Copperplate_Lower.add("𝙮");
        Copperplate_Lower.add("𝙯");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type5(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("𝑨");
        Copperplate_Upper.add("𝑩");
        Copperplate_Upper.add("𝑪");
        Copperplate_Upper.add("𝑫");
        Copperplate_Upper.add("𝑬");
        Copperplate_Upper.add("𝑭");
        Copperplate_Upper.add("𝑮");
        Copperplate_Upper.add("𝑯");
        Copperplate_Upper.add("𝑰");
        Copperplate_Upper.add("𝑱");
        Copperplate_Upper.add("𝑲");
        Copperplate_Upper.add("𝑳");
        Copperplate_Upper.add("𝑴");
        Copperplate_Upper.add("𝑵");
        Copperplate_Upper.add("𝑶");
        Copperplate_Upper.add("𝑷");
        Copperplate_Upper.add("𝑸");
        Copperplate_Upper.add("𝑹");
        Copperplate_Upper.add("𝑺");
        Copperplate_Upper.add("𝑻");
        Copperplate_Upper.add("𝑼");
        Copperplate_Upper.add("𝑽");
        Copperplate_Upper.add("𝑾");
        Copperplate_Upper.add("𝑿");
        Copperplate_Upper.add("𝒀");
        Copperplate_Upper.add("𝒁");

        Copperplate_Lower.add("𝒂");
        Copperplate_Lower.add("𝒃");
        Copperplate_Lower.add("𝒄");
        Copperplate_Lower.add("𝒅");
        Copperplate_Lower.add("𝒆");
        Copperplate_Lower.add("𝒇");
        Copperplate_Lower.add("𝒈");
        Copperplate_Lower.add("𝒉");
        Copperplate_Lower.add("𝒊");
        Copperplate_Lower.add("𝒋");
        Copperplate_Lower.add("𝒌");
        Copperplate_Lower.add("𝒍");
        Copperplate_Lower.add("𝒎");
        Copperplate_Lower.add("𝒏");
        Copperplate_Lower.add("𝒐");
        Copperplate_Lower.add("𝒑");
        Copperplate_Lower.add("𝒒");
        Copperplate_Lower.add("𝒓");
        Copperplate_Lower.add("𝒔");
        Copperplate_Lower.add("𝒕");
        Copperplate_Lower.add("𝒖");
        Copperplate_Lower.add("𝒗");
        Copperplate_Lower.add("𝒘");
        Copperplate_Lower.add("𝒙");
        Copperplate_Lower.add("𝒚");
        Copperplate_Lower.add("𝒛");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type6(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("𝙰");
        Copperplate_Upper.add("𝙱");
        Copperplate_Upper.add("𝙲");
        Copperplate_Upper.add("𝙳");
        Copperplate_Upper.add("𝙴");
        Copperplate_Upper.add("𝙵");
        Copperplate_Upper.add("𝙶");
        Copperplate_Upper.add("𝙷");
        Copperplate_Upper.add("𝙸");
        Copperplate_Upper.add("𝙹");
        Copperplate_Upper.add("𝙺");
        Copperplate_Upper.add("𝙻");
        Copperplate_Upper.add("𝙼");
        Copperplate_Upper.add("𝙽");
        Copperplate_Upper.add("𝙾");
        Copperplate_Upper.add("𝙿");
        Copperplate_Upper.add("𝚀");
        Copperplate_Upper.add("𝚁");
        Copperplate_Upper.add("𝚂");
        Copperplate_Upper.add("𝚃");
        Copperplate_Upper.add("𝚄");
        Copperplate_Upper.add("𝚅");
        Copperplate_Upper.add("𝚆");
        Copperplate_Upper.add("𝚇");
        Copperplate_Upper.add("𝚈");
        Copperplate_Upper.add("𝚉");

        Copperplate_Lower.add("𝚊");
        Copperplate_Lower.add("𝚋");
        Copperplate_Lower.add("𝚌");
        Copperplate_Lower.add("𝚍");
        Copperplate_Lower.add("𝚎");
        Copperplate_Lower.add("𝚏");
        Copperplate_Lower.add("𝚐");
        Copperplate_Lower.add("𝚑");
        Copperplate_Lower.add("𝚒");
        Copperplate_Lower.add("𝚓");
        Copperplate_Lower.add("𝚔");
        Copperplate_Lower.add("𝚕");
        Copperplate_Lower.add("𝚖");
        Copperplate_Lower.add("𝚗");
        Copperplate_Lower.add("𝚘");
        Copperplate_Lower.add("𝚙");
        Copperplate_Lower.add("𝚚");
        Copperplate_Lower.add("𝚛");
        Copperplate_Lower.add("𝚜");
        Copperplate_Lower.add("𝚝");
        Copperplate_Lower.add("𝚞");
        Copperplate_Lower.add("𝚟");
        Copperplate_Lower.add("𝚠");
        Copperplate_Lower.add("𝚡");
        Copperplate_Lower.add("𝚢");
        Copperplate_Lower.add("𝚣");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type7(String string_in) {
        ArrayList<String> Copperplate_Upper = new ArrayList<>();
        ArrayList<String> Copperplate_Lower = new ArrayList<>();
        Copperplate_Upper.add("A̶");
        Copperplate_Upper.add("B̶");
        Copperplate_Upper.add("C̶");
        Copperplate_Upper.add("D̶");
        Copperplate_Upper.add("E̶");
        Copperplate_Upper.add("F̶");
        Copperplate_Upper.add("G̶");
        Copperplate_Upper.add("H̶");
        Copperplate_Upper.add("I̶");
        Copperplate_Upper.add("J̶");
        Copperplate_Upper.add("K̶");
        Copperplate_Upper.add("L̶");
        Copperplate_Upper.add("M̶");
        Copperplate_Upper.add("N̶");
        Copperplate_Upper.add("O̶");
        Copperplate_Upper.add("P̶");
        Copperplate_Upper.add("Q̶");
        Copperplate_Upper.add("R̶");
        Copperplate_Upper.add("S̶");
        Copperplate_Upper.add("T̶");
        Copperplate_Upper.add("U̶");
        Copperplate_Upper.add("V̶");
        Copperplate_Upper.add("W̶");
        Copperplate_Upper.add("X̶");
        Copperplate_Upper.add("Y̶");
        Copperplate_Upper.add("Z̶");

        Copperplate_Lower.add("a̶");
        Copperplate_Lower.add("b̶");
        Copperplate_Lower.add("c̶");
        Copperplate_Lower.add("d̶");
        Copperplate_Lower.add("e̶");
        Copperplate_Lower.add("f̶");
        Copperplate_Lower.add("g̶");
        Copperplate_Lower.add("h̶");
        Copperplate_Lower.add("i̶");
        Copperplate_Lower.add("j̶");
        Copperplate_Lower.add("k̶");
        Copperplate_Lower.add("l̶");
        Copperplate_Lower.add("m̶");
        Copperplate_Lower.add("n̶");
        Copperplate_Lower.add("o̶");
        Copperplate_Lower.add("p̶̶");
        Copperplate_Lower.add("q̶");
        Copperplate_Lower.add("r̶");
        Copperplate_Lower.add("s̶");
        Copperplate_Lower.add("t̶");
        Copperplate_Lower.add("u̶");
        Copperplate_Lower.add("v̶");
        Copperplate_Lower.add("w̶");
        Copperplate_Lower.add("x̶");
        Copperplate_Lower.add("y̶");
        Copperplate_Lower.add("z̶");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append(Copperplate_Upper.get(c - 'A'));
            }
            else if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }


    public static String convert2type8(String string_in) {
        ArrayList<String> Copperplate_Lower = new ArrayList<>();

        Copperplate_Lower.add("𝙖");
        Copperplate_Lower.add("𝙗");
        Copperplate_Lower.add("𝙘");
        Copperplate_Lower.add("𝙙");
        Copperplate_Lower.add("𝙚");
        Copperplate_Lower.add("𝙛");
        Copperplate_Lower.add("𝙜");
        Copperplate_Lower.add("𝙝");
        Copperplate_Lower.add("𝙞");
        Copperplate_Lower.add("𝙟");
        Copperplate_Lower.add("𝙠");
        Copperplate_Lower.add("𝙡");
        Copperplate_Lower.add("𝙢");
        Copperplate_Lower.add("𝙣");
        Copperplate_Lower.add("𝙤");
        Copperplate_Lower.add("𝙥");
        Copperplate_Lower.add("𝙦");
        Copperplate_Lower.add("𝙧");
        Copperplate_Lower.add("𝙨");
        Copperplate_Lower.add("𝙩");
        Copperplate_Lower.add("𝙪");
        Copperplate_Lower.add("𝙫");
        Copperplate_Lower.add("𝙬");
        Copperplate_Lower.add("𝙭");
        Copperplate_Lower.add("𝙮");
        Copperplate_Lower.add("𝙯");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type9(String string_in) {
        ArrayList<String> Copperplate_Lower = new ArrayList<>();

        Copperplate_Lower.add("𝐚");
        Copperplate_Lower.add("𝐛");
        Copperplate_Lower.add("𝐜");
        Copperplate_Lower.add("𝐝");
        Copperplate_Lower.add("𝐞");
        Copperplate_Lower.add("𝐟");
        Copperplate_Lower.add("𝐠");
        Copperplate_Lower.add("𝐡");
        Copperplate_Lower.add("𝐢");
        Copperplate_Lower.add("𝐣");
        Copperplate_Lower.add("𝐤");
        Copperplate_Lower.add("𝐥");
        Copperplate_Lower.add("𝐦");
        Copperplate_Lower.add("𝐧");
        Copperplate_Lower.add("𝐨");
        Copperplate_Lower.add("𝐩");
        Copperplate_Lower.add("𝐪");
        Copperplate_Lower.add("𝐫");
        Copperplate_Lower.add("𝐬");
        Copperplate_Lower.add("𝐭");
        Copperplate_Lower.add("𝐮");
        Copperplate_Lower.add("𝐯");
        Copperplate_Lower.add("𝐰");
        Copperplate_Lower.add("𝐱");
        Copperplate_Lower.add("𝐲");
        Copperplate_Lower.add("𝐳");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type10(String string_in) {
        ArrayList<String> Copperplate_Lower = new ArrayList<>();

        Copperplate_Lower.add("𝓪");
        Copperplate_Lower.add("𝓫");
        Copperplate_Lower.add("𝓬");
        Copperplate_Lower.add("𝓭");
        Copperplate_Lower.add("𝓮");
        Copperplate_Lower.add("𝓯");
        Copperplate_Lower.add("𝓰");
        Copperplate_Lower.add("𝓱");
        Copperplate_Lower.add("𝓲");
        Copperplate_Lower.add("𝓳");
        Copperplate_Lower.add("𝓴");
        Copperplate_Lower.add("𝓵");
        Copperplate_Lower.add("𝓶");
        Copperplate_Lower.add("𝓷");
        Copperplate_Lower.add("𝓸");
        Copperplate_Lower.add("𝓹");
        Copperplate_Lower.add("𝓺");
        Copperplate_Lower.add("𝓻");
        Copperplate_Lower.add("𝓼");
        Copperplate_Lower.add("𝓽");
        Copperplate_Lower.add("𝓾");
        Copperplate_Lower.add("𝓿");
        Copperplate_Lower.add("𝔀");
        Copperplate_Lower.add("𝔁");
        Copperplate_Lower.add("𝔂");
        Copperplate_Lower.add("𝔃");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type11(String string_in) {
        ArrayList<String> Copperplate_Lower = new ArrayList<>();

        Copperplate_Lower.add("𝖆");
        Copperplate_Lower.add("𝖇");
        Copperplate_Lower.add("𝖈");
        Copperplate_Lower.add("𝖉");
        Copperplate_Lower.add("𝖊");
        Copperplate_Lower.add("𝖋");
        Copperplate_Lower.add("𝖌");
        Copperplate_Lower.add("𝖍");
        Copperplate_Lower.add("𝖎");
        Copperplate_Lower.add("𝖏");
        Copperplate_Lower.add("𝖐");
        Copperplate_Lower.add("𝖑");
        Copperplate_Lower.add("𝖒");
        Copperplate_Lower.add("𝖓");
        Copperplate_Lower.add("𝖔");
        Copperplate_Lower.add("𝖕");
        Copperplate_Lower.add("𝖖");
        Copperplate_Lower.add("𝖗");
        Copperplate_Lower.add("𝖘");
        Copperplate_Lower.add("𝖙");
        Copperplate_Lower.add("𝖚");
        Copperplate_Lower.add("𝖛");
        Copperplate_Lower.add("𝖜");
        Copperplate_Lower.add("𝖝");
        Copperplate_Lower.add("𝖞");
        Copperplate_Lower.add("𝖟");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type12(String string_in) {
        ArrayList<String> Copperplate_Lower = new ArrayList<>();

        Copperplate_Lower.add("𝗮");
        Copperplate_Lower.add("𝗯");
        Copperplate_Lower.add("𝗰");
        Copperplate_Lower.add("𝗱");
        Copperplate_Lower.add("𝗲");
        Copperplate_Lower.add("𝗳");
        Copperplate_Lower.add("𝗴");
        Copperplate_Lower.add("𝗵");
        Copperplate_Lower.add("𝗶");
        Copperplate_Lower.add("𝗷");
        Copperplate_Lower.add("𝗸");
        Copperplate_Lower.add("𝗹");
        Copperplate_Lower.add("𝗺");
        Copperplate_Lower.add("𝗻");
        Copperplate_Lower.add("𝗼");
        Copperplate_Lower.add("𝗽");
        Copperplate_Lower.add("𝗾");
        Copperplate_Lower.add("𝗿");
        Copperplate_Lower.add("𝘀");
        Copperplate_Lower.add("𝘁");
        Copperplate_Lower.add("𝘂");
        Copperplate_Lower.add("𝘃");
        Copperplate_Lower.add("𝘄");
        Copperplate_Lower.add("𝘅");
        Copperplate_Lower.add("𝘆");
        Copperplate_Lower.add("𝘇");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String convert2type13(String string_in) {
        ArrayList<String> Copperplate_Lower = new ArrayList<>();

        Copperplate_Lower.add("𝘢");
        Copperplate_Lower.add("𝘣");
        Copperplate_Lower.add("𝘤");
        Copperplate_Lower.add("𝘥");
        Copperplate_Lower.add("𝘦");
        Copperplate_Lower.add("𝘧");
        Copperplate_Lower.add("𝘨");
        Copperplate_Lower.add("𝘩");
        Copperplate_Lower.add("𝘪");
        Copperplate_Lower.add("𝘫");
        Copperplate_Lower.add("𝘬");
        Copperplate_Lower.add("𝘭");
        Copperplate_Lower.add("𝘮");
        Copperplate_Lower.add("𝘯");
        Copperplate_Lower.add("𝘰");
        Copperplate_Lower.add("𝘱");
        Copperplate_Lower.add("𝘲");
        Copperplate_Lower.add("𝘳");
        Copperplate_Lower.add("𝘴");
        Copperplate_Lower.add("𝘵");
        Copperplate_Lower.add("𝘶");
        Copperplate_Lower.add("𝘷");
        Copperplate_Lower.add("𝘸");
        Copperplate_Lower.add("𝘹");
        Copperplate_Lower.add("𝘺");
        Copperplate_Lower.add("𝘻");

        StringBuilder sb = new StringBuilder();
        for (char c : string_in.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                sb.append(Copperplate_Lower.get(c - 'a'));
            }
            else {
                sb.append(c);
            }
        }
        return sb.toString();
    }







}



/*



𝚊
𝚋
𝚌
𝚍
𝚎
𝚏
𝚐
𝚑
𝚒
𝚓
𝚔
𝚕
𝚖
𝚗
𝚘
𝚙
𝚚
𝚛
𝚜
𝚝
𝚞
𝚟
𝚠
𝚡
𝚢
𝚣


ⓐ
ⓑ
ⓒ
ⓓ
ⓔ
ⓕ
ⓖ
ⓗ
ⓘ
ⓙ
ⓚ
ⓛ
ⓜ
ⓝ
ⓞ
ⓟ
ⓠ
ⓡ
ⓢ
ⓣ
ⓤ
ⓥ
ⓦ
ⓧ
ⓨ
ⓩ


a̸
b̸
c̸
d̸
e̸
f̸
g̸
h̸
i̸
j̸
k̸
l̸
m̸
n̸
o̸
p̸
q̸
r̸
s̸
t̸
u̸
v̸
w̸
x̸
y̸
z̸


a꯭
b꯭
c꯭
d꯭
e꯭
f꯭
g꯭
h꯭
i꯭
j꯭
k꯭
l꯭
m꯭
n꯭
o꯭
p꯭
q꯭
r꯭
s꯭
t꯭
u꯭
v꯭
w꯭
x꯭
y꯭
z꯭



































🄐🄑🄒🄓🄔🄕🄖🄗🄘🄙🄚🄛🄜🄝🄞🄟🄠🄡🄢🄣🄤🄥🄦🄧🄨🄩
🄰🄱🄲🄳🄴🄵🄶🄷🄸🄹🄺🄻🄼🄽🄾🄿🅀🅁🅂🅃🅄🅅🅆🅇🅈🅉
🅐🅑🅒🅓🅔🅕🅖🅗🅘🅙🅚🅛🅜🅝🅞🅟🅠🅡🅢🅣🅤🅥🅦🅧🅨🅩
🅰️🅱️🅲🅳🅴🅵🅶🅷🅸🅹🅺🅻🅼🅽🅾️🅿️🆀🆁🆂🆃🆄🆅🆆🆇🆈🆉






ABCDEFGHIJKLMNOPQRSTUVWXYZ
คЪcdεƒgʜ¡jкłɱหσpqяรtuvωxყz

ABCDEFGHIJKLMNOPQRSTUVWXYZ
αвc∂єƒgнιנкℓмηøρqɾšтυvωχчz

ABCDEFGHIJKLMNOPQRSTUVWXYZ
ɐqɔpəɟɓɥıɾʞlɯuodbɹsʇnʌʍxʎz

ABCDEFGHIJKLMNOPQRSTUVWXYZ
ค๖¢ɗεƒghiวkl๓noρqɾstนงωxฯz

ABCDEFGHIJKLMNOPQRSTUVWXYZ
αbcɗєƒghıȷkɭmησρqrstυѵωxyર

ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ
ⓐⓑⓒⓓⓔⓕⓖⓗⓘⓙⓚⓛⓜⓝⓞⓟⓠⓡⓢⓣⓤⓥⓦⓧⓨⓩ

ABCDEFGHIJKLMNOPQRSTUVWXYZ
ค๒ς๔єŦﻮђเןкl๓ภ๏קợгรtยשฬאץz

ABCDEFGHIJKLMNOPQRSTUVWXYZ
åβçď£ƒğЋ!jķŁ๓ñ¤קợř§†µ√Ψ×ÿž

Λß₡ÐΞŦGĦЇJКŁMÑΘPQЯ§TЦV₩Ж¥Z
Λß₡ÐΞŦGĦЇJКŁMÑΘPQЯ§TЦV₩Ж¥Z

ɅƁȻƊƸƑƓǶƗJƘŁMƝȎƤǪƦŜȾƯѴWXɎȤ
ɅƁȻƊƸƑƓǶƗJƘŁMƝȎƤǪƦŜȾƯѴWXɎȤ

ABCDEFGHIJKLMNOPQRSTUVWXYZ
ᴀʙᴄᴅᴇғɢʜɪᴊᴋʟᴍɴᴏᴘǫʀꜱᴛᴜᴠᴡxʏᴢ

ABCDEFGHIJKLMNOPQRSTUVWXYZ
άвς∂έғģħίјķĻмήόρqŕşţùνώxчž

ABCDEFGHIJKLMNOPQRSTUVWXYZ
Дþ¢Ð3ƒgђîjkℓм₪øÞQЯ§†û√w×¥ž

ABCDEFGHIJKLMNOPQRSTUVWXYZ
abςdєŦﻮђijкlmnoקợгstuשwץאz

ABCDEFGHIJKLMNOPQRSTUVWXYZ
ΛBCDΣFGΉIJKLMПӨPQЯSŦЦVЩXYZ

ABCDEFGHIJKLMNOPQRSTUVWXYZ
ąβčď€ƒδЂίjЌℓ๓ŋ๏ρợя$ţµѵώж¥ź

ABCDEFGHIJKLMNOPQRSTUVWXYZ
∆бς∂∑ﾓбｻⅰﾉкﾚ㎡и◊ㄕqЯㄅ₮ㄩ√w×ㄚz

 */