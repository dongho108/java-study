# live-study 참여율 대시보드 만들기

## live-study 대시 보드를 만드는 코드를 작성하세요.

* 깃헙 이슈 1번부터 18번까지 댓글을 순회하며 댓글을 남긴 사용자를 체크 할 것.
참여율을 계산하세요.
* 총 18회에 중에 몇 %를 참여했는지 소숫점 두자리가지 보여줄 것.
* Github 자바 라이브러리를 사용하면 편리합니다.
* 깃헙 API를 익명으로 호출하는데 제한이 있기 때문에 본인의 깃헙 프로젝트에 이슈를 만들고 테스트를 하시면 더 자주 테스트할 수 있습니다.

## 스터디 현황
|참여자 (277)|1주차|2주차|3주차|4주차|5주차|6주차|7주차|8주차|9주차|10주차|11주차|12주차|13주차|14주차|15주차|16주차|17주차|18주차|참여율|
|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|---|
|이창섭|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||||||||55.56%|
|wony9324|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|sseung||||||:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||16.67%|
|MaengSol|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||33.33%|
|CHAE JEONG LEE|:white_check_mark:||||||||||||||||||5.56%|
|Heewon Gwak|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|TaeJeong Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||33.33%|
|JBB|:white_check_mark:||||||||||||||||||5.56%|
|opensesame|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|YOONJU EOM|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|Bae Sangwoo|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|yeji an|:white_check_mark:|||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||55.56%|
|YuSeungMo|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Bikoo|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|남상우|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Yongsun Shin|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||:white_check_mark:|:white_check_mark:|||||||38.89%|
|Yang Junhyeok|:white_check_mark:|||:white_check_mark:|||:white_check_mark:||||||||||||16.67%|
|Yumin Kim|:white_check_mark:||||||||||||||||||5.56%|
|Dong-Hun|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|jong ik Kim|:white_check_mark:||||||||||||||||||5.56%|
|scs||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||66.67%|
|공부하자|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|DongSub_Joung|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|gibaek lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||:white_check_mark:|||||||||33.33%|
|Davinci.J|||||||:white_check_mark:||||||||||||5.56%|
|Seungha Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||44.44%|
|Haeman Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|-|:white_check_mark:||||||||||||||||||5.56%|
|Heonjun|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||55.56%|
|류정관|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|GeonHee Ryu|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Sooyeon Park|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||77.78%|
|Sunhwan Lee||||:white_check_mark:|:white_check_mark:||||||||||||||11.11%|
|유종현|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||38.89%|
|Dongmin Kang|:white_check_mark:||||||||||||||||||5.56%|
|gwkim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|JopopScript|:white_check_mark:||||||||||||||||||5.56%|
|Sunny|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:|:white_check_mark:|:white_check_mark:|||||66.67%|
|joanne|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Min Je Jang||||||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||22.22%|
|Kimin|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|Jihwan_Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|HaeinOh|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|372|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||:white_check_mark:||55.56%|
|Qurie Moon|:white_check_mark:|||||:white_check_mark:|:white_check_mark:||||:white_check_mark:||||||||22.22%|
|HyungjuJang|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|Hyeon Wu Jeon|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||55.56%|
|Sooah Lee|:white_check_mark:||||||||||||||||||5.56%|
|Taehwa Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|모영진|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||:white_check_mark:|||||66.67%|
|Kiseok Yang|:white_check_mark:||||||||||||||||||5.56%|
|nimkoes|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||:white_check_mark:||83.33%|
|sungblee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||||||||||||33.33%|
|ejpark|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||72.22%|
|D0|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|ssebong777|||||||:white_check_mark:||||||||||||5.56%|
|Lim|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:||||||||44.44%|
|Youngsil Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|abcdefg|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||66.67%|
|E.Park|:white_check_mark:||||||||||||||||||5.56%|
|YoonJeong|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:||||66.67%|
|JeongHwanMin|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|jaeeunis|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||77.78%|
|jinwook|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:|:white_check_mark:|||||||55.56%|
|Hyeong Suk|:white_check_mark:||||||||||||||||||5.56%|
|chulphan||||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||66.67%|
|Seokhyun |:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|이준형|:white_check_mark:|||:white_check_mark:|||||||||||||||11.11%|
|Jihoon Oh|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|Jiwon|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:||||72.22%|
|Seunghak Na|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|sungjinchoi|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||38.89%|
|김민걸|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||77.78%|
|Changyeop|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|KimJunhan|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|이은택 (Lee EunTaek)|:white_check_mark:|||:white_check_mark:|||||||||||||||11.11%|
|Dongwook, Kim|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||44.44%|
|SeJongDeveloper|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||:white_check_mark:||72.22%|
|Jeong-In Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|KIYEON-KIM|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Junhyeong Jo|:white_check_mark:||||||||||||||||||5.56%|
|gurumee jang|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||22.22%|
|9bini|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|박준철|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|DongKwan You||||:white_check_mark:|||||||||||||||5.56%|
|WonYong Jang|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||61.11%|
|서지영|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||33.33%|
|MinHyun Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||||66.67%|
|Seong Chan Hwang|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Jeon.|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||61.11%|
|EunSeong.dev|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|||||66.67%|
|yeseul lee|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||:white_check_mark:||77.78%|
|sangmessi|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Joowan Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|HeeSeok Noh|:white_check_mark:||||||||||||||||||5.56%|
|Minsung Son|:white_check_mark:||||||||||||||||||5.56%|
|ghYoon93||||:white_check_mark:|||||||||||||||5.56%|
|JANG WOOJIN|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|DevMiddleStone|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|SOHYEON|:white_check_mark:||||||||||||||||||5.56%|
|Yejin Jeong|:white_check_mark:||||||||||||||||||5.56%|
|JuHee Yoon|:white_check_mark:||||||||||||||||||5.56%|
|withham|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||50.00%|
|Edward|:white_check_mark:||||||||||||||||||5.56%|
|Sunga|:white_check_mark:||||||||||||||||||5.56%|
|DaHun|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||:white_check_mark:|||||66.67%|
|DongHun Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||||||:white_check_mark:||55.56%|
|delusidiot|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|신가은|||||:white_check_mark:|:white_check_mark:|||||||||||||11.11%|
|Seungmin Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Ji Hoon Bae|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||55.56%|
|이정진(Jeongjin Lee)|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|dondonh|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|SangYeop, Ha|:white_check_mark:||||||||||||||||||5.56%|
|Kevin Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||77.78%|
|JAEJOON KIM||||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||66.67%|
|Nekisse|:white_check_mark:||||||||||||||||||5.56%|
|jongwon|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|sskim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||77.78%|
|Damho Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||:white_check_mark:||77.78%|
|accidently|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||22.22%|
|sjhello|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
| Sungjun HWANG|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Ryu||:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||16.67%|
|Hong Sung Pill|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Youngbin Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|kjs|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|dami|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|이우길|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|U・ᴥ・U|:white_check_mark:||||||||||||||||||5.56%|
|Choi Hyangkeun|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:||||72.22%|
|jigmini|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||:white_check_mark:||83.33%|
|YunHwan Park|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||38.89%|
|Kyungrok Cho|:white_check_mark:||||||||||||||||||5.56%|
|Soojung Choi|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|ddings|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Sojeong Sim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|SeongJae||||:white_check_mark:|||||||||||||||5.56%|
|손지수|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Nakyeon Ko|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Jaydeen|:white_check_mark:||||||||||||||||||5.56%|
|Bogeun|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||38.89%|
|Jihoon Yeo|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||||||||||||||22.22%|
|hs|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Tina Jeong|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||61.11%|
|Haemin Jeong|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|LEE GI CHEOL|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|Yunok|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||:white_check_mark:||72.22%|
|ChoHongJae|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Kwon Sam Chan|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|Taehyun Jung|:white_check_mark:||||||||||||||||||5.56%|
|lee-maru|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|||||66.67%|
|SUNGBUM PARK|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|leejoowon|:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:|:white_check_mark:||||||||||||27.78%|
|shinyoung|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|yoonseo kim|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|JuRepia|:white_check_mark:||||||||||||||||||5.56%|
|shinkyuchul|:white_check_mark:|:white_check_mark:|||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||66.67%|
|Myeonghun Park|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|Oh Sang-Woo|:white_check_mark:||||||||||||||||||5.56%|
|MS KIM|:white_check_mark:||||||||||||||||||5.56%|
|Seungin Yang|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|KIM Jongwan|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|이문혁|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||:white_check_mark:||||66.67%|
|MinHeum|:white_check_mark:||||||||||||||||||5.56%|
|JoonYoung Maeng|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|Shin Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|Dongsun Lee|:white_check_mark:||||||||||||||||||5.56%|
|kukim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|Woopaloopa||||:white_check_mark:|||||||||||||||5.56%|
|Roeniss Moon|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Bitna Lee|:white_check_mark:||||||||||||||||||5.56%|
|장일규|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|정현주|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|||||66.67%|
|HanJaehee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||44.44%|
|TheWing|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||83.33%|
|Kim Yong Kwan||||||:white_check_mark:|||||||:white_check_mark:||||||11.11%|
|Jinoo|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|JaeyeonKIM|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|JeongheeKim||||||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||38.89%|
|KangMyungJoe|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||38.89%|
|Kimwoojae|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|SungSoo Lee|||||:white_check_mark:||:white_check_mark:|||:white_check_mark:|:white_check_mark:||||||||22.22%|
|lkimilhol|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Changhwan Son|:white_check_mark:|:white_check_mark:|||:white_check_mark:||||||||||||||16.67%|
|JessYT|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Seongho Jin||||||:white_check_mark:|:white_check_mark:||||||||||||11.11%|
|LEE JAE YEON|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|||:white_check_mark:||77.78%|
|Dion|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Hoon||||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||33.33%|
|soongjamm|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|woo sung|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|Catsbi|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|devksh930|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||33.33%|
|weekwith.me|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Shin Eonju|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|||||:white_check_mark:||66.67%|
|서상원(Seo Sang won)|:white_check_mark:|:white_check_mark:||||:white_check_mark:|:white_check_mark:||:white_check_mark:||||||||||27.78%|
|KyungJae Jang|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||72.22%|
|EuiSung|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||61.11%|
|Seunguk|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|HiBs|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|Deleted user|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:|||:white_check_mark:|||||||||||27.78%|
|ssonzk|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Yejin Choi|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||||77.78%|
|YoonHJ||||:white_check_mark:|:white_check_mark:||:white_check_mark:||||||||||||16.67%|
|Geonyeol Park|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|Hwanse|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|박일훈|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||33.33%|
|bomin||||||||||:white_check_mark:|||||||||5.56%|
|TaeinKim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|jinyoungLee|:white_check_mark:|||||||||||||:white_check_mark:|||:white_check_mark:||16.67%|
|junnyoung Choi|:white_check_mark:||||||||||||||||||5.56%|
|LEE Sang Min|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|LEE SEOWOO|:white_check_mark:||||||||||||||||||5.56%|
|yeontae, Kim|:white_check_mark:||||||||||||||||||5.56%|
|Henu|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Won Seok Oh|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||77.78%|
|mozing_|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Gomding||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||83.33%|
|jay.c||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||72.22%|
|Crazy|:white_check_mark:||:white_check_mark:||||||||||||||||11.11%|
|hyunbin.park|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Bongf|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Jeongmin Yeo|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|jaden94|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|noah|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|yhh1056|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||77.78%|
|HyeBin, Park|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||38.89%|
|Juyeong Park|:white_check_mark:||||||||||||||||||5.56%|
|edj|:white_check_mark:||||||||||||||||||5.56%|
|miseong Shin|:white_check_mark:||||||||||||||||||5.56%|
|zeze|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Keesun Baik|:white_check_mark:|:white_check_mark:||||:white_check_mark:|:white_check_mark:||:white_check_mark:||||||||:white_check_mark:||33.33%|
|Shion|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||44.44%|
|Sunwoo Han|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Jongyean Park|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:||||:white_check_mark:||72.22%|
|eunsukoh|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||27.78%|
|Seunghan Lee|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||55.56%|
|redbean88|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|LeeJuHyun|:white_check_mark:||||||||||||||||||5.56%|
|개밥자||||||||||:white_check_mark:|||||||||5.56%|
|conyconydev|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||72.22%|
|Hanul Lee|:white_check_mark:|||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||33.33%|
|jungeuiyub|:white_check_mark:||||||||||||||||||5.56%|
|Lee Sang Min|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|오유경|:white_check_mark:||||||||||||||||||5.56%|
|garlickim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||||83.33%|
|HongJun Choi|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|sooyoung park|:white_check_mark:||||:white_check_mark:||:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||27.78%|
|KwakSeungHyeok|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:|||||||||||38.89%|
|Philip|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Hoyoung Jung|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Kim Seong Jun|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||:white_check_mark:||||||50.00%|
|Jason Time|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|||||72.22%|
|WooCheol Kim|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||77.78%|
|hanjiho|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||33.33%|
|uHan|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||||||22.22%|
|이영빈|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Jaehyun Park|:white_check_mark:|||:white_check_mark:|:white_check_mark:||||||||||||||16.67%|
|김준호|:white_check_mark:||||||||||||||||||5.56%|
|rowanlee92|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||88.89%|
|Jeon Jihoon|:white_check_mark:|:white_check_mark:|||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||:white_check_mark:||61.11%|
|ParkJungHun|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|SoyiJang|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|JOngNan|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Mia Kim|||||||||||:white_check_mark:||||||||5.56%|
|positive-choi|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|ParkMinGon (javanitto)|:white_check_mark:||||||||||||:white_check_mark:||||||11.11%|
|길재은|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:|:white_check_mark:||||||66.67%|
|임승현|:white_check_mark:|:white_check_mark:|:white_check_mark:||||||||||||||||16.67%|
|Younghoon Lee|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Lee||||:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:||:white_check_mark:||72.22%|
|LEE|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||||||44.44%|
|황재원|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Byungjun Woo|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|:white_check_mark:|||||||66.67%|
|Ugo|:white_check_mark:|:white_check_mark:|||||||||||||||||11.11%|
|Lee June Hee|:white_check_mark:|:white_check_mark:||||||||:white_check_mark:|||||||||16.67%|
