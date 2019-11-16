package udit.programmer.co.mydccollection

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_course_card.view.*

class MovieAdapter(val moviesn: ArrayList<Movies>) : RecyclerView.Adapter<MovieViewHolder>() {

    var onItemClickListener: MovieOnItemClickListener? = null

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieViewHolder {

        val inflator = LayoutInflater.from(parent.context)

        val itemview = inflator.inflate(R.layout.list_item_course_card, parent, false)

        return MovieViewHolder(itemview)

    }

    override fun getItemCount(): Int = moviesn.size

    override fun onBindViewHolder(holder: MovieViewHolder, position: Int) {
        holder.bind(moviesn[position])
        holder.itemView.setOnClickListener {
            onItemClickListener?.onClick(moviesn[position])
        }
    }
}