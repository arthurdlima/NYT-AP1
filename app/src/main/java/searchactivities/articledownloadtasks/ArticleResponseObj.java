package searchactivities.articledownloadtasks;

import java.util.List;

public class ArticleResponseObj {
    // I installed gson formatter, copied and pasted json result from web, and it created the required fields.

    private String status;
    private String copyright;
    private ResponseBean response;

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

    public ResponseBean getResponse() {
        return response;
    }

    public void setResponse(ResponseBean response) {
        this.response = response;
    }

    public static class ResponseBean {

        private MetaBean meta;
        private List<DocsBean> docs;

        public MetaBean getMeta() {
            return meta;
        }

        public void setMeta(MetaBean meta) {
            this.meta = meta;
        }

        public List<DocsBean> getDocs() {
            return docs;
        }

        public void setDocs(List<DocsBean> docs) {
            this.docs = docs;
        }

        public static class MetaBean {

            private int hits;
            private int offset;
            private int time;

            public int getHits() {
                return hits;
            }

            public void setHits(int hits) {
                this.hits = hits;
            }

            public int getOffset() {
                return offset;
            }

            public void setOffset(int offset) {
                this.offset = offset;
            }

            public int getTime() {
                return time;
            }

            public void setTime(int time) {
                this.time = time;
            }
        }

        public static class DocsBean {

            private String web_url;
            private HeadlineBean headline;
            private String pub_date;
            private double score;
            private List<MultimediaBean> multimedia;

            public String getWeb_url() {
                return web_url;
            }

            public void setWeb_url(String web_url) {
                this.web_url = web_url;
            }

            public HeadlineBean getHeadline() {
                return headline;
            }

            public void setHeadline(HeadlineBean headline) {
                this.headline = headline;
            }

            public String getPub_date() {
                return pub_date;
            }

            public void setPub_date(String pub_date) {
                this.pub_date = pub_date;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public List<MultimediaBean> getMultimedia() {
                return multimedia;
            }

            public void setMultimedia(List<MultimediaBean> multimedia) {
                this.multimedia = multimedia;
            }

            public static class HeadlineBean {

                private String main;
                private Object kicker;
                private Object content_kicker;
                private String print_headline;
                private Object name;
                private Object seo;
                private Object sub;

                public String getMain() {
                    return main;
                }

                public void setMain(String main) {
                    this.main = main;
                }

                public Object getKicker() {
                    return kicker;
                }

                public void setKicker(Object kicker) {
                    this.kicker = kicker;
                }

                public Object getContent_kicker() {
                    return content_kicker;
                }

                public void setContent_kicker(Object content_kicker) {
                    this.content_kicker = content_kicker;
                }

                public String getPrint_headline() {
                    return print_headline;
                }

                public void setPrint_headline(String print_headline) {
                    this.print_headline = print_headline;
                }

                public Object getName() {
                    return name;
                }

                public void setName(Object name) {
                    this.name = name;
                }

                public Object getSeo() {
                    return seo;
                }

                public void setSeo(Object seo) {
                    this.seo = seo;
                }

                public Object getSub() {
                    return sub;
                }

                public void setSub(Object sub) {
                    this.sub = sub;
                }
            }

            public static class MultimediaBean {

                private int rank;
                private String subtype;
                private Object caption;
                private Object credit;
                private String type;
                private String url;
                private int height;
                private int width;
                private LegacyBean legacy;
                private String subType;
                private String crop_name;

                public int getRank() {
                    return rank;
                }

                public void setRank(int rank) {
                    this.rank = rank;
                }

                public String getSubtype() {
                    return subtype;
                }

                public void setSubtype(String subtype) {
                    this.subtype = subtype;
                }

                public Object getCaption() {
                    return caption;
                }

                public void setCaption(Object caption) {
                    this.caption = caption;
                }

                public Object getCredit() {
                    return credit;
                }

                public void setCredit(Object credit) {
                    this.credit = credit;
                }

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

                public LegacyBean getLegacy() {
                    return legacy;
                }

                public void setLegacy(LegacyBean legacy) {
                    this.legacy = legacy;
                }

                public String getSubType() {
                    return subType;
                }

                public void setSubType(String subType) {
                    this.subType = subType;
                }

                public String getCrop_name() {
                    return crop_name;
                }

                public void setCrop_name(String crop_name) {
                    this.crop_name = crop_name;
                }

                public static class LegacyBean {

                    private String xlarge;
                    private int xlargewidth;
                    private int xlargeheight;

                    public String getXlarge() {
                        return xlarge;
                    }

                    public void setXlarge(String xlarge) {
                        this.xlarge = xlarge;
                    }

                    public int getXlargewidth() {
                        return xlargewidth;
                    }

                    public void setXlargewidth(int xlargewidth) {
                        this.xlargewidth = xlargewidth;
                    }

                    public int getXlargeheight() {
                        return xlargeheight;
                    }

                    public void setXlargeheight(int xlargeheight) {
                        this.xlargeheight = xlargeheight;
                    }
                }
            }
        }
    }
}
