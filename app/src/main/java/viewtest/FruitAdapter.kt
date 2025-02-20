package viewtest

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.tangshg.onedrive.R

class FruitAdapter(activity:Activity,val resourceId:Int,
                          data : List<viewtest.Fruit>):
ArrayAdapter<Fruit>(activity,resourceId,data){

    // inner class 关键字用来定义内部类
    inner class ViewHolder(val fruitImage:ImageView,val fruitName:TextView){}

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val view : View
        val viewHolder : ViewHolder

        if(convertView == null){
            view = LayoutInflater.from(context).inflate(resourceId, parent, false)
            val fruitName : TextView = view.findViewById(R.id.fruit_name)
            val fruitImage : ImageView = view.findViewById(R.id.fruit_image)
            viewHolder = ViewHolder(fruitImage, fruitName)
            view.tag = viewHolder
        }else{
            view = convertView
            viewHolder = view.tag as ViewHolder
        }

        val fruit = getItem(position)//获取当前的是 Fruit 实例
        if (fruit != null){
            viewHolder.fruitName.text = fruit.name
            viewHolder.fruitImage.setImageResource(fruit.imageId)
        }
        return view
    }

}
