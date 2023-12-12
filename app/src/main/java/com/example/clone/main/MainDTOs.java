package com.example.clone.main;

import com.example.clone.R;

public class MainDTOs {



    public class RankingDTO{
        private int imgRes, rank, quan;
        private String name;

        public RankingDTO(int imgRes, int rank, int quan, String name) {
            this.imgRes = imgRes;
            this.rank = rank;
            this.quan = quan;
            this.name = name;
        }

        public int getImgRes() {
            return imgRes;
        }

        public void setImgRes(int imgRes) {
            this.imgRes = imgRes;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public int getQuan() {
            return quan;
        }

        public void setQuan(int quan) {
            this.quan = quan;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
    public class RecoDTO{
        private int imgRes;
        private String name , quan;

        public RecoDTO(int imgRes, String quan, String name) {
            this.imgRes = imgRes;
            this.quan = quan;
            this.name = name;
        }

        public int getImgRes() {
            return imgRes;
        }

        public void setImgRes(int imgRes) {
            this.imgRes = imgRes;
        }

        public String getQuan() {
            return quan;
        }

        public void setQuan(String quan) {
            this.quan = quan;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
