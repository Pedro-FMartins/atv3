/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ativ_3;

/**
 *
 * @author Pedro
 */
public class Corpo_Humano 
{
  
   public float massa;
   // Apenas alteramos o nível de acesso para PÚBLICO 
   // da instância "massa".
   
   private float densidade;
   private float volume;
   private float altura;
   private float IMC;
   // c1.massa = "2";  
   // O programa não está reconhecendo o obj c1.
   
   
   public Corpo_Humano (float massa, float altura, float volume)
   {
       this.massa = massa;
       this.volume = volume;
       densidade = massa / volume;
       this.altura = altura;
       IMC = massa / (altura*altura);
   }
   
   
   public float GetMassa()
   {
       return massa;
   }
   
   public float GetIMC()
   {
      return IMC; 
   }
   public float GetVolume()
   {
       return volume;
   }
   
   public float GetDensidade()
   {
       return densidade;
   }
   
   public void SetMassa(float massa)
   {
       this.massa = massa;
       densidade = massa / volume;
   }
   
   private void SetVolume(float volume)
   {
       this.volume = volume;
       densidade = massa / volume;
   } 
   // Mais uma vez o nível de acesso foi alterado mas desta vez
   // o método SetVolume foi PRIVATIZADO.
    
}
