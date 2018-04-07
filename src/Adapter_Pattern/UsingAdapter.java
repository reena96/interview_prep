package Adapter_Pattern;


import java.net.Socket;

/*ADAPTER


        We have a US Socket and we have an Indian plug.
        But we can insert only a US Plug into a US Socket. (And similarly only an Indian plug into an Indian Socket)
*/

class US_Socket{
    public void plugIn(USPlug plug){
        plug.getUSSupply();
    }
}


interface USPlug{
    void getUSSupply();
}

class Indian_Socket{
    public void plugIn(IndianPlug plug){
        plug.getIndianSupply();
    }
}

interface IndianPlug{
    void getIndianSupply();
}


   /*    IndianPlug  -> X (CANT BE PUT)  US_Socket

   To use the US Socket with an Indian plug, we need a IndiaToUSAdapterPlug so that we
    can put our Indian plug into the AdapterPlug and put the adapterPlug into the USSocket.


  That is,
        IndianPlug -> IndiaToUSAdapter Plug -> USSocket
*/

class IndiaToUSAdapterPlug implements USPlug{

    IndianPlug plug;

    public IndiaToUSAdapterPlug(IndianPlug plug){
        this.plug = plug;
    }


       @Override
       public void getUSSupply() {
        plug.getIndianSupply();
       }
   }


   /* IndianPlug  -> X (CANT BE PUT)  US_Socket
            So,
            IndianPlug -> IndiaToUSAdapter Plug  (LIKE USPlug) -> US_Socket
            IndiaToUSAdapterPlug is a form of US Plug that can fit into the US_Socket.
            (So to create Adapter, extend USPlug)

            */
public class UsingAdapter {
    public static void main(String[] args) {

        IndianPlug plug = null;
        US_Socket us_socket = new US_Socket();
        USPlug usAdapterPlug = new IndiaToUSAdapterPlug(plug);
        us_socket.plugIn(usAdapterPlug);

    }
}