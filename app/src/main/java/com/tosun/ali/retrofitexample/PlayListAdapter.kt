package com.tosun.ali.retrofitexample

import android.support.design.widget.CoordinatorLayout
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.tek_satir_layout.view.*

class PlayListAdapter(tumPlaylistData: List<PlaylistData.Items>) : RecyclerView.Adapter<PlayListAdapter.PlayListAdapterViewHolder>() {

    var tumPlaylistData: List<PlaylistData.Items>

    init {
        this.tumPlaylistData = tumPlaylistData
    }

    override fun getItemCount(): Int {

        return  tumPlaylistData.size
    }


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): PlayListAdapterViewHolder {

        var inflater = LayoutInflater.from(p0.context)

        var tek_satir_layout = inflater.inflate(R.layout.tek_satir_layout,p0,false)

        return PlayListAdapterViewHolder(tek_satir_layout)

    }


    override fun onBindViewHolder(p0: PlayListAdapterViewHolder, p1: Int) {
        var oAnOlusturulanSatir = tumPlaylistData.get(p1)
        p0.setData(oAnOlusturulanSatir,p1)


    }


    inner class PlayListAdapterViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var tek_satir_layout = itemView as CoordinatorLayout

        var tvPlayListTitle = tek_satir_layout.tvPlayListTitle
        var imgPlayListİmage = tek_satir_layout.imgPlayListİmage


        fun setData(oAnOlusturulanSatir:PlaylistData.Items,position: Int) {

            tvPlayListTitle.text = oAnOlusturulanSatir.snippet!!.title.toString()

            var gelenResimUrl = oAnOlusturulanSatir.snippet!!.thumbnails!!.high!!.url.toString()

            Picasso.get().load(gelenResimUrl).into(imgPlayListİmage)

        }

    }

}