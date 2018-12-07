package com.tosun.ali.retrofitexample

import com.google.gson.annotations.SerializedName

class PlaylistData {

    @SerializedName("kind")
    var kind: String? = null
    @SerializedName("etag")
    var etag: String? = null
    @SerializedName("nextPageToken")
    var nextPageToken: String? = null
    @SerializedName("pageInfo")
    var pageInfo: PageInfo? = null
    @SerializedName("items")
    var items: List<Items>? = null


    class PageInfo {
        @SerializedName("totalResults")
        var totalResults: Int = 0
        @SerializedName("resultsPerPage")
        var resultsPerPage: Int = 0
    }

    class MyDefault {
        @SerializedName("url")
        var url: String? = null
        @SerializedName("width")
        var width: Int = 0
        @SerializedName("height")
        var height: Int = 0
    }

    class Medium {
        @SerializedName("url")
        var url: String? = null
        @SerializedName("width")
        var width: Int = 0
        @SerializedName("height")
        var height: Int = 0
    }

    class High {
        @SerializedName("url")
        var url: String? = null
        @SerializedName("width")
        var width: Int = 0
        @SerializedName("height")
        var height: Int = 0
    }

    class Standard {
        @SerializedName("url")
        var url: String? = null
        @SerializedName("width")
        var width: Int = 0
        @SerializedName("height")
        var height: Int = 0
    }

    class Maxres {
        @SerializedName("url")
        var url: String? = null
        @SerializedName("width")
        var width: Int = 0
        @SerializedName("height")
        var height: Int = 0
    }

    class Thumbnails {
        @SerializedName("default")
        var mdefault: MyDefault? = null
        @SerializedName("medium")
        var medium: Medium? = null
        @SerializedName("high")
        var high: High? = null
        @SerializedName("standard")
        var standard: Standard? = null
        @SerializedName("maxres")
        var maxres: Maxres? = null
    }

    class Localized {
        @SerializedName("title")
        var title: String? = null
        @SerializedName("description")
        var description: String? = null
    }

    class Snippet {
        @SerializedName("publishedAt")
        var publishedAt: String? = null
        @SerializedName("channelId")
        var channelId: String? = null
        @SerializedName("title")
        var title: String? = null
        @SerializedName("description")
        var description: String? = null
        @SerializedName("thumbnails")
        var thumbnails: Thumbnails? = null
        @SerializedName("channelTitle")
        var channelTitle: String? = null
        @SerializedName("localized")
        var localized: Localized? = null
    }

    class Items {
        @SerializedName("kind")
        var kind: String? = null
        @SerializedName("etag")
        var etag: String? = null
        @SerializedName("id")
        var id: String? = null
        @SerializedName("snippet")
        var snippet: Snippet? = null
    }
}
/*
Örneğin JSON dosyasına Name şeklinde bir alan varken biz Java sınıfı içinde bunu String Name;
şeklinde tanımlamamalıyız, yine String name şeklinde kullanmalıyız. Bu durumda da JSON’daki Name ile Java sınıfındaki
name isim olarak eşleşmediği için GSON objeyi oluştururken değer yüklemesi yapamaıyor. İşte bu durumda imdadımıza
@SerializedName notasyonu yetişiyor. Eğer JSON içindeki alanı
Java sınıfı içinde başka bir isimle temsil etmek istersek bu notasyon vasıtası ile tanımlama yapabiliriz
*/
