package moviereviewactivities.moviereviewdownloadtasks;

import java.util.List;

public class MovieResponseObj {


    private String status;
    private String copyright;
    private boolean has_more;
    private int num_results;
    private List<ResultsBean> results;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public boolean isHas_more() {
        return has_more;
    }

    public void setHas_more(boolean has_more) {
        this.has_more = has_more;
    }

    public int getNum_results() {
        return num_results;
    }

    public void setNum_results(int num_results) {
        this.num_results = num_results;
    }

    public List<ResultsBean> getResults() {
        return results;
    }

    public void setResults(List<ResultsBean> results) {
        this.results = results;
    }

    public static class ResultsBean {


        private String display_title;
        private String mpaa_rating;
        private int critics_pick;
        private String byline;
        private String headline;
        private String summary_short;
        private String publication_date;
        private String opening_date;
        private String date_updated;
        private LinkBean link;
        private MultimediaBean multimedia;

        public String getDisplay_title() {
            return display_title;
        }

        public void setDisplay_title(String display_title) {
            this.display_title = display_title;
        }

        public String getMpaa_rating() {
            return mpaa_rating;
        }

        public void setMpaa_rating(String mpaa_rating) {
            this.mpaa_rating = mpaa_rating;
        }

        public int getCritics_pick() {
            return critics_pick;
        }

        public void setCritics_pick(int critics_pick) {
            this.critics_pick = critics_pick;
        }

        public String getByline() {
            return byline;
        }

        public void setByline(String byline) {
            this.byline = byline;
        }

        public String getHeadline() {
            return headline;
        }

        public void setHeadline(String headline) {
            this.headline = headline;
        }

        public String getSummary_short() {
            return summary_short;
        }

        public void setSummary_short(String summary_short) {
            this.summary_short = summary_short;
        }

        public String getPublication_date() {
            return publication_date;
        }

        public void setPublication_date(String publication_date) {
            this.publication_date = publication_date;
        }

        public String getOpening_date() {
            return opening_date;
        }

        public void setOpening_date(String opening_date) {
            this.opening_date = opening_date;
        }

        public String getDate_updated() {
            return date_updated;
        }

        public void setDate_updated(String date_updated) {
            this.date_updated = date_updated;
        }

        public LinkBean getLink() {
            return link;
        }

        public void setLink(LinkBean link) {
            this.link = link;
        }

        public MultimediaBean getMultimedia() {
            return multimedia;
        }

        public void setMultimedia(MultimediaBean multimedia) {
            this.multimedia = multimedia;
        }

        public static class LinkBean {

            private String type;
            private String url;
            private String suggested_link_text;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getSuggested_link_text() {
                return suggested_link_text;
            }

            public void setSuggested_link_text(String suggested_link_text) {
                this.suggested_link_text = suggested_link_text;
            }
        }

        public static class MultimediaBean {

            private String type;
            private String src;
            private int width;
            private int height;

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }
        }
    }
}
