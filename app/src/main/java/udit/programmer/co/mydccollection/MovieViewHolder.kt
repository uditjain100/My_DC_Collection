package udit.programmer.co.mydccollection

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_layout.view.*

class MovieViewHolder(itemview: View) : RecyclerView.ViewHolder(itemview) {

    fun bind(movien: Movies) {

        itemView.img.setImageResource(movien.img)
        itemView.name.text = movien.name
        itemView.year.text = "[" + movien.year + "]"

    }

}