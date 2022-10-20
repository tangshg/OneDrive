package viewtest

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tangshg.onedrive.R

class FruitAdapterRecycler(val fruitList: List<Fruit>):
    RecyclerView.Adapter<FruitAdapterRecycler.ViewHolder>() {
        //这里传入 view 是 recycler 子项的最外层布局
        inner class ViewHolder(view : View):RecyclerView.ViewHolder(view){
            val fruitName : TextView = view.findViewById(R.id.fruit_name)
            val fruitImager : ImageView = view.findViewById(R.id.fruit_image)
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.fruit_item,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.fruitImager.setImageResource(fruit.imageId)
        holder.fruitName.text = fruit.name

    }

    override fun getItemCount() = fruitList.size
}