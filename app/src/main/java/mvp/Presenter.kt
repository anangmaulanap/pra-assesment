package id.co.imastudio.santri.kotlin1.mvp

/**
 * Created by Server on 21/08/2017.
 */
class Presenter {

    var presenterView : PresenterView?=null
    //buat secondary constructor
    constructor(presenterView: PresenterView?) {
        this.presenterView = presenterView
    }
    //buat method
    fun Hitung(nilai1 : String, nilai2 : String){
        if (nilai1.isNotEmpty()&&nilai2.isNotEmpty()){
            //convert string menuju double
            var x = nilai1.toDouble()
            var y = nilai2.toDouble()
            //calcut
            var hasil = (x*y) /2
           presenterView?.hasil(hasil.toString())

        } else{
            //deklarasi variabel dialog
           /* var alert = AlertDialog.Builder(this)
            alert.setTitle("Warning !!")
            alert.setMessage("tidak bisa kosng edittext")
            alert.setIcon(R.mipmap.ic_launcher)

            alert.setPositiveButton("ok", DialogInterface.OnClickListener { dialogInterface, i ->
                dialogInterface.dismiss()
            })
            alert.show()*/
        }

    }
}