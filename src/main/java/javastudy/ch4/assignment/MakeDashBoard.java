package javastudy.ch4.assignment;

import org.apache.commons.lang3.StringUtils;
import org.kohsuke.github.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MakeDashBoard {
    public static void main(String[] args) throws IOException {
        String path = "src/main/resources/application.properties";
        GitHub gitHub = GitHubBuilder.fromPropertyFile(path).build();

        GHRepository repository = gitHub.getRepository("dongho108/github-api-test");
//        GHRepository repository = gitHub.getRepository("whiteship/live-study");

        List<GHIssue> issues = repository.getIssues(GHIssueState.ALL);
        HashMap<String, List<Integer>> dashboard = new HashMap<String, List<Integer>>();

        System.out.println(issues.size());

        for (int i=0; i< issues.size(); i++) {

            System.out.println(i + "...");
            GHIssue issue = issues.get(i);
            List<GHIssueComment> comments = issue.getComments();
            for (GHIssueComment comment : comments) {
                String userName = comment.getUser().getName();
                if (dashboard.containsKey(userName)) {
                    dashboard.get(userName).add(i);
                } else {
                    List<Integer> x = new ArrayList<>();
                    x.add(i);
                    dashboard.put(userName, x);
                }
            }

        }

        for (String key : dashboard.keySet()) {
            List<Integer> values = dashboard.get(key);
            System.out.println(key);
            String join = StringUtils.join(values, ", ");
            System.out.println(join);
        }

    }
}
//
//        18
//        0...
//        1...
//        2...
//        3...
//        4...
//        5...
//        6...
//        7...
//        8...
//        9...
//        10...
//        11...
//        12...
//        13...
//        14...
//        15...
//        16...
//        17...
//        null
//        1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 9, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 13, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17
//        이창섭
//        7, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        wony9324
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        sseung
//        10, 11, 12
//        MaengSol
//        11, 12, 13, 14, 16, 17
//        CHAE JEONG LEE
//        17
//        Heewon Gwak
//        13, 14, 15, 16, 17
//        TaeJeong Kim
//        12, 13, 14, 15, 16, 17
//        JBB
//        17
//        opensesame
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        YOONJU EOM
//        14, 15, 16, 17
//        Bae Sangwoo
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        yeji an
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 17
//        YuSeungMo
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Bikoo
//        15, 16, 17
//        남상우
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Yongsun Shin
//        6, 7, 13, 14, 15, 16, 17
//        Yang Junhyeok
//        11, 14, 17
//        Yumin Kim
//        17
//        Dong-Hun
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        jong ik Kim
//        17
//        scs
//        5, 6, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
//        공부하자
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        DongSub_Joung
//        16, 17
//        gibaek lee
//        8, 13, 14, 15, 16, 17
//        Davinci.J
//        11
//        Seungha Lee
//        10, 11, 12, 13, 14, 15, 16, 17
//        Haeman Lee
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        -
//        17
//        Heonjun
//        8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        류정관
//        14, 15, 16, 17
//        GeonHee Ryu
//        16, 17
//        Sooyeon Park
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Sunhwan Lee
//        13, 14
//        유종현
//        11, 12, 13, 14, 15, 16, 17
//        Dongmin Kang
//        17
//        gwkim
//        14, 15, 16, 17
//        JopopScript
//        17
//        Sunny
//        4, 5, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        joanne
//        15, 16, 17
//        Min Je Jang
//        9, 10, 11, 12
//        Kimin
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Jihwan_Kim
//        15, 16, 17
//        HaeinOh
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        372
//        1, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Qurie Moon
//        7, 11, 12, 17
//        HyungjuJang
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Hyeon Wu Jeon
//        8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Sooah Lee
//        17
//        Taehwa Lee
//        13, 14, 15, 16, 17
//        모영진
//        4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Kiseok Yang
//        17
//        nimkoes
//        1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        sungblee
//        11, 13, 14, 15, 16, 17
//        ejpark
//        4, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        D0
//        16, 17
//        ssebong777
//        11
//        Lim
//        7, 10, 11, 12, 13, 14, 16, 17
//        Youngsil Kim
//        13, 14, 15, 16, 17
//        abcdefg
//        5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17
//        E.Park
//        17
//        YoonJeong
//        3, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17
//        JeongHwanMin
//        16, 17
//        jaeeunis
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17
//        jinwook
//        6, 6, 7, 10, 11, 12, 13, 14, 15, 16, 17
//        Hyeong Suk
//        17
//        chulphan
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
//        Seokhyun
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        이준형
//        14, 17
//        Jihoon Oh
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Jiwon
//        3, 4, 5, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17
//        Seunghak Na
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        sungjinchoi
//        11, 12, 13, 14, 15, 16, 17
//        김민걸
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Changyeop
//        14, 15, 16, 17
//        KimJunhan
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        이은택 (Lee EunTaek)
//        14, 17
//        Dongwook, Kim
//        9, 10, 11, 12, 13, 14, 15, 17
//        SeJongDeveloper
//        1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Jeong-In Lee
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        KIYEON-KIM
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Junhyeong Jo
//        17
//        gurumee jang
//        13, 14, 15, 17
//        9bini
//        14, 15, 16, 17
//        박준철
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        DongKwan You
//        14
//        WonYong Jang
//        6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17
//        서지영
//        12, 13, 14, 15, 16, 17
//        MinHyun Lee
//        3, 4, 6, 7, 8, 9, 10, 12, 13, 15, 16, 17
//        Seong Chan Hwang
//        6, 7, 8, 9, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Jeon.
//        6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17
//        EunSeong.dev
//        4, 6, 7, 8, 10, 11, 12, 13, 14, 15, 16, 17
//        yeseul lee
//        1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17
//        sangmessi
//        16, 17
//        Joowan Kim
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        HeeSeok Noh
//        17
//        Minsung Son
//        17
//        ghYoon93
//        14
//        JANG WOOJIN
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        DevMiddleStone
//        13, 14, 15, 16, 17
//        SOHYEON
//        17
//        Yejin Jeong
//        17
//        JuHee Yoon
//        17
//        withham
//        6, 7, 8, 11, 12, 13, 14, 16, 17
//        Edward
//        17
//        Sunga
//        17
//        DaHun
//        4, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        DongHun Kim
//        1, 7, 8, 10, 11, 12, 12, 13, 15, 16, 17, 17
//        delusidiot
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        신가은
//        12, 13
//        Seungmin Lee
//        15, 16, 17
//        Ji Hoon Bae
//        8, 9, 10, 11, 11, 12, 13, 14, 15, 16, 17
//        이정진(Jeongjin Lee)
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        dondonh
//        15, 16, 17
//        SangYeop, Ha
//        17
//        Kevin Lee
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        JAEJOON KIM
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
//        Nekisse
//        17
//        jongwon
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        sskim
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Damho Lee
//        1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        accidently
//        13, 14, 15, 17
//        sjhello
//        16, 17
//        Sungjun HWANG
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Ryu
//        14, 15, 16
//        Hong Sung Pill
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Youngbin Kim
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        kjs
//        15, 16, 17
//        dami
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        이우길
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        U・ᴥ・U
//        17
//        Choi Hyangkeun
//        3, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        jigmini
//        1, 3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        YunHwan Park
//        10, 11, 12, 14, 15, 16, 17
//        Kyungrok Cho
//        17
//        Soojung Choi
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        ddings
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Sojeong Sim
//        13, 14, 15, 16, 17
//        SeongJae
//        14
//        손지수
//        15, 16, 17
//        Nakyeon Ko
//        15, 16, 17
//        Jaydeen
//        17, 17
//        Bogeun
//        11, 12, 13, 14, 15, 16, 17
//        Jihoon Yeo
//        13, 15, 16, 17
//        hs
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Tina Jeong
//        7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Haemin Jeong
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        LEE GI CHEOL
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Yunok
//        1, 3, 4, 6, 7, 8, 11, 12, 13, 14, 15, 16, 17
//        ChoHongJae
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Kwon Sam Chan
//        13, 14, 15, 16, 17
//        Taehyun Jung
//        17
//        lee-maru
//        4, 6, 7, 8, 9, 10, 11, 13, 14, 15, 16, 17
//        SUNGBUM PARK
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        leejoowon
//        11, 12, 15, 16, 17
//        shinyoung
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        yoonseo kim
//        16, 17
//        JuRepia
//        17
//        shinkyuchul
//        3, 4, 5, 6, 7, 9, 10, 11, 12, 13, 16, 17
//        Myeonghun Park
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Oh Sang-Woo
//        17
//        MS KIM
//        17
//        Seungin Yang
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        KIM Jongwan
//        16, 17
//        이문혁
//        3, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        MinHeum
//        17
//        JoonYoung Maeng
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Shin Kim
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Dongsun Lee
//        17
//        kukim
//        14, 15, 16, 17
//        Woopaloopa
//        14
//        Roeniss Moon
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Bitna Lee
//        17
//        장일규
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        정현주
//        4, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17
//        HanJaehee
//        10, 11, 12, 13, 14, 15, 16, 17
//        TheWing
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 17
//        Kim Yong Kwan
//        5, 12
//        Jinoo
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        JaeyeonKIM
//        16, 17
//        JeongheeKim
//        6, 7, 8, 9, 10, 11, 12
//        KangMyungJoe
//        10, 11, 12, 13, 15, 16, 17
//        Kimwoojae
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        SungSoo Lee
//        7, 8, 11, 13
//        lkimilhol
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Changhwan Son
//        13, 16, 17
//        JessYT
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Seongho Jin
//        11, 12
//        LEE JAE YEON
//        1, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Dion
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Hoon
//        9, 10, 11, 12, 13, 14
//        soongjamm
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        woo sung
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Catsbi
//        14, 15, 16, 17
//        devksh930
//        11, 12, 13, 14, 16, 17
//        weekwith.me
//        15, 16, 17
//        Shin Eonju
//        1, 6, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        서상원(Seo Sang won)
//        9, 11, 12, 16, 17
//        KyungJae Jang
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 15, 16, 17
//        EuiSung
//        3, 4, 5, 6, 7, 8, 13, 14, 15, 16, 17
//        Seunguk
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        HiBs
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Deleted user
//        10, 13, 14, 15, 17
//        ssonzk
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Yejin Choi
//        3, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        YoonHJ
//        11, 13, 14
//        Geonyeol Park
//        13, 14, 15, 16, 17
//        Hwanse
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        박일훈
//        12, 13, 14, 15, 16, 17
//        bomin
//        8
//        TaeinKim
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        jinyoungLee
//        1, 4, 17
//        junnyoung Choi
//        17
//        LEE Sang Min
//        15, 16, 17
//        LEE SEOWOO
//        17
//        yeontae, Kim
//        17
//        Henu
//        15, 16, 17
//        Won Seok Oh
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        mozing_
//        16, 17
//        Gomding
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
//        jay.c
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16
//        Crazy
//        15, 17
//        hyunbin.park
//        16, 17
//        Bongf
//        15, 16, 17
//        Jeongmin Yeo
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        jaden94
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        noah
//        15, 16, 16, 17, 17
//        yhh1056
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        HyeBin, Park
//        11, 12, 13, 14, 15, 16, 17
//        Juyeong Park
//        17
//        edj
//        17
//        miseong Shin
//        17
//        zeze
//        16, 17
//        Keesun Baik
//        1, 1, 9, 11, 12, 16, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17, 17
//        Shion
//        10, 11, 12, 13, 14, 15, 16, 17
//        Sunwoo Han
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Jongyean Park
//        1, 5, 6, 7, 9, 10, 11, 12, 13, 14, 15, 15, 16, 17
//        eunsukoh
//        13, 14, 15, 16, 17
//        Seunghan Lee
//        8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        redbean88
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        LeeJuHyun
//        17
//        개밥자
//        8
//        conyconydev
//        5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Hanul Lee
//        10, 11, 12, 13, 14, 17
//        jungeuiyub
//        17
//        Lee Sang Min
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        오유경
//        17
//        garlickim
//        3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        HongJun Choi
//        16, 17
//        sooyoung park
//        9, 10, 11, 13, 17
//        KwakSeungHyeok
//        10, 11, 13, 14, 15, 16, 17
//        Philip
//        16, 17
//        Hoyoung Jung
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Kim Seong Jun
//        5, 10, 11, 12, 13, 14, 15, 16, 17
//        Jason Time
//        4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        WooCheol Kim
//        4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        hanjiho
//        12, 13, 14, 15, 16, 17
//        uHan
//        14, 15, 16, 17
//        이영빈
//        15, 16, 17
//        Jaehyun Park
//        13, 14, 17
//        김준호
//        17
//        rowanlee92
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Jeon Jihoon
//        1, 6, 7, 8, 9, 10, 11, 12, 13, 16, 17
//        ParkJungHun
//        15, 16, 17
//        SoyiJang
//        15, 16, 17
//        JOngNan
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Mia Kim
//        7
//        positive-choi
//        15, 16, 17
//        ParkMinGon (javanitto)
//        5, 17
//        길재은
//        5, 6, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        임승현
//        15, 16, 17
//        Younghoon Lee
//        16, 17
//        Lee
//        1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14
//        LEE
//        10, 11, 12, 13, 14, 15, 16, 17
//        황재원
//        16, 17
//        Byungjun Woo
//        6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17
//        Ugo
//        16, 17
//        Lee June Hee
//        8, 16, 17

