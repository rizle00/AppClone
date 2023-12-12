package com.example.clone.main;

import com.example.clone.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainDAO {


    int[] getBannerList(){
        int[] list  = {
            R.drawable.top_banner1,R.drawable.top_banner2,R.drawable.top_banner3,
                    R.drawable.top_banner4,R.drawable.top_banner5,R.drawable.top_banner6,
                    R.drawable.top_banner7,R.drawable.top_banner8,R.drawable.top_banner9,
                    R.drawable.top_banner10,R.drawable.top_banner11,R.drawable.top_banner12,
                    R.drawable.top_banner13,R.drawable.top_banner14,R.drawable.top_banner15,
                    R.drawable.top_banner16 };

        return list;
    }
    ArrayList<MainDTOs.RankingDTO> getPariRankList(){

        ArrayList<MainDTOs.RankingDTO> list =  new ArrayList<>();
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari1,1, 1000, "아메리카노"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari2,2, 1000, "아이스아메리카노"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari3,3, 500, "부드럽고 촉촉한 굿모닝 롤"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari4,4, 0, "고소한 버터 핑거스틱"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari5,5, 0, "카페라떼"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari6,6, 0, "에그베이컨토스트"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari7_10,7, 0, "에그듬뿍 햄치즈토스트"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari8,8, 0, "아이스카페라떼"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari9,9, 0, "건강가득 통밀브레드"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.pari7_10,10, 0, "에그듬뿍 햄치즈토스트"));
        return list;
    }
    ArrayList<MainDTOs.RankingDTO> getIngiRankList(){

        ArrayList<MainDTOs.RankingDTO> list =  new ArrayList<>();
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi1,1, 0, "단팥빵"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi2,2, 1000, "아이스아메리카노"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi3,3, 300, "실키롤케익"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi4,4, 1000, "부드러운 정통우유식빵"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi5,5, 0, "[NEW]단백질 듬뿍 로스트치킨 에그 샐러드"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi6,6, 0, "메리 베리 롤케익"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi7,7, 0, "후레쉬 크림빵"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi8,8, 0, "X-MAX 뽀로로 롤리초코 (1개)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi9,9, 0, "[NEW]크랜베리 치킨 리코타 샐러드"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.ingi10,10, 0, "초코 왕소라빵 플러스"));
        return list;
    }
    ArrayList<MainDTOs.RankingDTO> getHealthRankList(){

        ArrayList<MainDTOs.RankingDTO> list =  new ArrayList<>();
        list.add(new MainDTOs().new RankingDTO(R.drawable.health1,1, 500, "런치 샌드위치"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health2,2, 0, "[NEW]단백질 듬뿍 로스트치킨 에그 샐러드"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health3,3, 300, "통밀 햄에그 샌드위치"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health4,4, 300, "디럭스 샌드위치"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health5,5, 0, "미니버거 샌드위치"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health6,6, 300, "에그샐러드샌드위치"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health7,7, 0, "런치 플러스 샌드위치"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health8,8, 0, "크랜베리치킨호밀샌드위치"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health9,9, 0, "[NEW]크랜베리 치킨 리코타 샐러드"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.health10,10, 0, "통밀디럭스샌드위치"));
        return list;
    }
    ArrayList<MainDTOs.RankingDTO> getSweetRankList(){

        ArrayList<MainDTOs.RankingDTO> list =  new ArrayList<>();
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet1,1, 0, "정통 에그타르트"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet2,2, 0, "미스터베어"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet3,3, 0, "오리지널 머핀"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet4,4, 0, "초콜릿 머핀"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet5,5, 0, "미스베어"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet6,6, 0, "초코 마카롱"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet7,7, 0, "겉바속쫀까눌레"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet8,8, 0, "콰트로 치즈머핀"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet9,9, 0, "가나슈생크림 조각케이크"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.sweet10,10, 0, "뉴욕치즈타르트"));
        return list;
    }
    ArrayList<MainDTOs.RankingDTO> getCakeRankList(){

        ArrayList<MainDTOs.RankingDTO> list =  new ArrayList<>();
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake1,1, 1000, "마이넘버원(18cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake2,2, 1000, "초코반딸기반케이크(18cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake3,3, 500, "진한크림치즈 가득 클래식 치즈케이크(21cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake4,4, 0, "클래식 고구마케이크(18cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake5,5, 0, "상큼한 블루베리쉬폰(18cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake6,6, 0, "블라썸 러브(13cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake7,7, 0, "고구마반생크림반케이크(18cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake8,8, 0, "클래식모카케이크(19cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake9,9, 0, "딸기 블라썸 케이크(12cm)"));
        list.add(new MainDTOs().new RankingDTO(R.drawable.cake10,10, 0, "별이 빛나는 밤에(18cm)"));
        return list;
    }




    ArrayList<MainDTOs.RecoDTO> getRecoList(){
        ArrayList<MainDTOs.RecoDTO> list = new ArrayList<>();
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec1, "3만", "베리 요거트 케이크(15cm)"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec2, "3만8천", "로얄밀크티"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec3, "1만4천", "아이스 로얄밀크티"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec4, "18만", "인생 초코생크림빵"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec5, "8만4천", "짱구는 못말려 청포도맛(PET)"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec6, "12만", "갈릭버터 바게뜨"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec7, "9만5천", "명란버터 바게뜨"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec8, "4만4천", "발효버터 명란소금빵"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec9, "6만4천", "롱트위스트파이"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.rec10, "13만6천", "초코트위스트파이"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec1,"3만7천","삐뽀삐뽀 출동! 소방차 케이크 (15x10x12cm)"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec2,"16만4천","콤비네이션피자 바게뜨"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec3,"9만","치즈미트 바게뜨"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec4,"14만1천","대파감자그라탕 바게뜨"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec5,"21만8천","추억의 앙꼬빵(6개입)"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec6,"16만5천","귀리가득 홀그레인 오트식빵"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec7,"1만2천","아다지오 시그니처 캡슐커피"));
        list.add(new MainDTOs().new RecoDTO(R.drawable.yrec8,"1만6천","아다지오 시그니처 드립백"));

        return list;
    }

    ArrayList<MainDTOs.YoutubeDTO> getYouList(){
        ArrayList<MainDTOs.YoutubeDTO> list = new ArrayList<>();
        list.add(new MainDTOs().new YoutubeDTO(R.drawable.thum1, R.drawable.content_text1));
        list.add(new MainDTOs().new YoutubeDTO(R.drawable.thum2, R.drawable.content_text2));
        list.add(new MainDTOs().new YoutubeDTO(R.drawable.thum3, R.drawable.content_text3));
        list.add(new MainDTOs().new YoutubeDTO(R.drawable.thum4, R.drawable.content_text4));
        list.add(new MainDTOs().new YoutubeDTO(R.drawable.thum5, R.drawable.content_text5));
        list.add(new MainDTOs().new YoutubeDTO(R.drawable.thum6, R.drawable.content_text6));
        return list;
    }
}
