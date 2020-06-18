package udit.programmer.co.mydccollection

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieAdapter(val moviesn: ArrayList<Movies>) : RecyclerView.Adapter<MovieViewHolder>() {

    var onItemClickListener: MovieOnItemClickListener? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {
        val itemview = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false)
        return MovieViewHolder(itemview)
    }

    override fun getItemCount(): Int = moviesn.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(moviesn[position])
        holder.itemView.setOnClickListener {
            onItemClickListener?.onClick(moviesn[position])
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (moviesn.size == 1) 0
        else {
            if (moviesn.size % 2 == 0) 1 else {
                if (position > 1 && position == moviesn.size - 1) 0 else 1
            }
        }
    }
}