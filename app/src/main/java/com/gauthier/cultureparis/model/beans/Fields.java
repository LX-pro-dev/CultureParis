package com.gauthier.cultureparis.model.beans;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Alexandre GAUTHIER on2020/09/17
 */
public class Fields implements Serializable {
    private Integer blind;
    private Integer pmr;
    private String date_end;
    private Integer deaf;
    private String updated_at;
    private String access_type;
    private String occurrences;
    private String contact_name;
    private String address_street;
    private String id;
    private List<Float> lat_lon = null;
    private String category;
    private String title;
    private String date_start;
    private String price_detail;
    private String access_link;
    private String contact_url;
    private String address_name;
    private String contact_phone;
    private String description;
    private String tags;
    private String contact_mail;
    private String lead_text;
    private String cover_url;
    private String contact_facebook;
    private String address_city;
    private String price_type;
    private String url;
    private String date_description;
    private String address_zipcode;
    private String transport;

    /*************************
     * GETTER / SETTER
     * **********************/

    public Integer getBlind() {
        return blind;
    }

    public void setBlind(Integer blind) {
        this.blind = blind;
    }

    public Integer getPmr() {
        return pmr;
    }

    public void setPmr(Integer pmr) {
        this.pmr = pmr;
    }

    public String getDate_end() {
        return date_end;
    }

    public void setDate_end(String date_end) {
        this.date_end = date_end;
    }

    public Integer getDeaf() {
        return deaf;
    }

    public void setDeaf(Integer deaf) {
        this.deaf = deaf;
    }

    public String getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    public String getAccess_type() {
        return access_type;
    }

    public void setAccess_type(String access_type) {
        this.access_type = access_type;
    }

    public String getOccurrences() {
        return occurrences;
    }

    public void setOccurrences(String occurrences) {
        this.occurrences = occurrences;
    }

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getAddress_street() {
        return address_street;
    }

    public void setAddress_street(String address_street) {
        this.address_street = address_street;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Float> getLat_lon() {
        return lat_lon;
    }

    public void setLat_lon(List<Float> lat_lon) {
        this.lat_lon = lat_lon;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate_start() {
        return date_start;
    }

    public void setDate_start(String date_start) {
        this.date_start = date_start;
    }

    public String getPrice_detail() {
        return price_detail;
    }

    public void setPrice_detail(String price_detail) {
        this.price_detail = price_detail;
    }

    public String getAccess_link() {
        return access_link;
    }

    public void setAccess_link(String access_link) {
        this.access_link = access_link;
    }

    public String getContact_url() {
        return contact_url;
    }

    public void setContact_url(String contact_url) {
        this.contact_url = contact_url;
    }

    public String getAddress_name() {
        return address_name;
    }

    public void setAddress_name(String address_name) {
        this.address_name = address_name;
    }

    public String getContact_phone() {
        return contact_phone;
    }

    public void setContact_phone(String contact_phone) {
        this.contact_phone = contact_phone;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags;
    }

    public String getContact_mail() {
        return contact_mail;
    }

    public void setContact_mail(String contact_mail) {
        this.contact_mail = contact_mail;
    }

    public String getLead_text() {
        return lead_text;
    }

    public void setLead_text(String lead_text) {
        this.lead_text = lead_text;
    }

    public String getCover_url() {
        return cover_url;
    }

    public void setCover_url(String cover_url) {
        this.cover_url = cover_url;
    }

    public String getContact_facebook() {
        return contact_facebook;
    }

    public void setContact_facebook(String contact_facebook) {
        this.contact_facebook = contact_facebook;
    }

    public String getAddress_city() {
        return address_city;
    }

    public void setAddress_city(String address_city) {
        this.address_city = address_city;
    }

    public String getPrice_type() {
        return price_type;
    }

    public void setPrice_type(String price_type) {
        this.price_type = price_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDate_description() {
        return date_description;
    }

    public void setDate_description(String date_description) {
        this.date_description = date_description;
    }

    public String getAddress_zipcode() {
        return address_zipcode;
    }

    public void setAddress_zipcode(String address_zipcode) {
        this.address_zipcode = address_zipcode;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }
}
