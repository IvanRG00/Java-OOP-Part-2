����   4 9	      bg/unwe/Course name Ljava/lang/String;
  	 
   java/lang/Object <init> ()V  java/util/ArrayList
  		     students Ljava/util/ArrayList;
     add (Ljava/lang/Object;)Z
     get (I)Ljava/lang/Object;  bg/unwe/Student
     ! size ()I 	Signature (Ljava/util/ArrayList<Lbg/unwe/Student;>; getName ()Ljava/lang/String; Code LineNumberTable LocalVariableTable this Lbg/unwe/Course; setName (Ljava/lang/String;)V MethodParameters 
addStudent (Lbg/unwe/Student;)V student Lbg/unwe/Student; 	getSudent (I)Lbg/unwe/Student; index I getStudentsCount 
SourceFile Course.java !                "    #   $ %  &   /     *� �    '        (        ) *    + ,  &   >     *+� �    '   
       (        ) *         -           &   B     *� *� Y� � �    '            (        ) *    . /  &   B     
*� +� W�    '   
     	   (       
 ) *     
 0 1  -    0    2 3  &   @     *� � � �    '       # (        ) *      4 5  -    4    6 !  &   2     *� � �    '       ' (        ) *    7    8