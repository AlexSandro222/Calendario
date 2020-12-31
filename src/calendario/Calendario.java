
package Calendario;

/**
 *
 * @author aless
 */
public class Calendario {
public int giorno;
public int mese;
public int anno;

public Calendario (){
    
}

    public Calendario(int giorno, int mese, int anno) {
        this.giorno = giorno;
        this.mese = mese;
        this.anno = anno;
    }
public boolean isBisestile(int anno){
 boolean risultato = false;
 if(anno%400==0){
  risultato = true;   
 }else if((anno%4==0)&&!(anno%100==0)){
  risultato = true;   
 }else{
  risultato = false;   
 }
 return risultato;
}  
public int numeroGiorni (int meseInput,int annoInput){
 int risultato = 0; 
 boolean controlloBisestile = isBisestile(annoInput); 
 if(meseInput==1){
  risultato = 31;   
 }else if(meseInput==2&&controlloBisestile){
  risultato = 29;
 }else if(meseInput==2&&!controlloBisestile){
  risultato = 28;   
 }else if(meseInput==3){
  risultato = 31;   
 }else if(meseInput==4){
  risultato = 30;
 }else if(meseInput==5){
  risultato = 31;   
 }else if(meseInput==6){
  risultato = 30;
 }else if(meseInput==7){
  risultato = 31;
 }else if(meseInput==8){
  risultato = 31;   
 }else if(meseInput==9){
  risultato = 30;   
 }else if(meseInput==10){
  risultato = 31;   
 }else if(meseInput==11){
  risultato = 31;    
 }else if(meseInput==12){
  risultato = 31;   
 }
  return risultato;
 
 
}    
    
 public int numeroProgressivo(String data){
  int risultato = 0;
  String[] arrayData = data.split("/");
  int giorno = Integer.parseInt(arrayData[0]);
  int mese = Integer.parseInt(arrayData[1]);
  int anno = Integer.parseInt(arrayData[2]);
  int sommaGiorni = 0;
  for(int i = 1;i<mese;i++){
   int giorni = numeroGiorni(i,anno);
   sommaGiorni = sommaGiorni + giorni;
  }
  risultato = sommaGiorni + giorno;
  return risultato;
 }
 
 

public static void main(String[] args){
 Calendario calendario = new Calendario();
 calendario.numeroProgressivo("30/12/2020");
}





   
    
}
