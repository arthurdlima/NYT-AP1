package topstoriesactivities.topstoriesdownloadtasks;


import com.google.gson.annotations.SerializedName;

import java.util.List;

public class TopStoriesResponseObj {

    // I installed gson formatter, copied and pasted json result from web, and it created the required fields.


    private String status;
    private String copyright;
    private String section;
    private String last_updated;
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

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public String getLast_updated() {
        return last_updated;
    }

    public void setLast_updated(String last_updated) {
        this.last_updated = last_updated;
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

        private String section;
        private String subsection;
        private String title;
        @SerializedName("abstract")
        private String abstractX;
        private String url;
        private String byline;
        private String item_type;
        private String updated_date;
        private String created_date;
        private String published_date;
        private String material_type_facet;
        private String kicker;
        private String short_url;
        private List<String> des_facet;
        private List<?> org_facet;
        private List<String> per_facet;
        private List<?> geo_facet;
        private List<MultimediaBean> multimedia;

        public String getSection() {
            return section;
        }

        public void setSection(String section) {
            this.section = section;
        }

        public String getSubsection() {
            return subsection;
        }

        public void setSubsection(String subsection) {
            this.subsection = subsection;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getAbstractX() {
            return abstractX;
        }

        public void setAbstractX(String abstractX) {
            this.abstractX = abstractX;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getByline() {
            return byline;
        }

        public void setByline(String byline) {
            this.byline = byline;
        }

        public String getItem_type() {
            return item_type;
        }

        public void setItem_type(String item_type) {
            this.item_type = item_type;
        }

        public String getUpdated_date() {
            return updated_date;
        }

        public void setUpdated_date(String updated_date) {
            this.updated_date = updated_date;
        }

        public String getCreated_date() {
            return created_date;
        }

        public void setCreated_date(String created_date) {
            this.created_date = created_date;
        }

        public String getPublished_date() {
            return published_date;
        }

        public void setPublished_date(String published_date) {
            this.published_date = published_date;
        }

        public String getMaterial_type_facet() {
            return material_type_facet;
        }

        public void setMaterial_type_facet(String material_type_facet) {
            this.material_type_facet = material_type_facet;
        }

        public String getKicker() {
            return kicker;
        }

        public void setKicker(String kicker) {
            this.kicker = kicker;
        }

        public String getShort_url() {
            return short_url;
        }

        public void setShort_url(String short_url) {
            this.short_url = short_url;
        }

        public List<String> getDes_facet() {
            return des_facet;
        }

        public void setDes_facet(List<String> des_facet) {
            this.des_facet = des_facet;
        }

        public List<?> getOrg_facet() {
            return org_facet;
        }

        public void setOrg_facet(List<?> org_facet) {
            this.org_facet = org_facet;
        }

        public List<String> getPer_facet() {
            return per_facet;
        }

        public void setPer_facet(List<String> per_facet) {
            this.per_facet = per_facet;
        }

        public List<?> getGeo_facet() {
            return geo_facet;
        }

        public void setGeo_facet(List<?> geo_facet) {
            this.geo_facet = geo_facet;
        }

        public List<MultimediaBean> getMultimedia() {
            return multimedia;
        }

        public void setMultimedia(List<MultimediaBean> multimedia) {
            this.multimedia = multimedia;
        }

        public static class MultimediaBean {

            private String url;
            private String format;
            private int height;
            private int width;
            private String type;
            private String subtype;
            private String caption;
            private String copyright;

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getFormat() {
                return format;
            }

            public void setFormat(String format) {
                this.format = format;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public String getSubtype() {
                return subtype;
            }

            public void setSubtype(String subtype) {
                this.subtype = subtype;
            }

            public String getCaption() {
                return caption;
            }

            public void setCaption(String caption) {
                this.caption = caption;
            }

            public String getCopyright() {
                return copyright;
            }

            public void setCopyright(String copyright) {
                this.copyright = copyright;
            }
        }
    }
}
