package com.example.quize

object Constant{

    const val user:String= "user_name"
    const val total:String="total_question"
    const val correct:String="correct_answer"

    fun question():ArrayList<ques>
    {
        val questionlists= ArrayList<ques>()
            val ques1= ques(1,
                "Which Bollywood movie features the popular song 'Chaiyya Chaiyya' ?",
                R.drawable.chaiya,
                "Main Hoon na",
                "Chalte Chalte",
                "DDLJ","Dil Se",
                4
            )
        questionlists.add(ques1)

        val ques2= ques(2,
            "Who composed the music for the movie 'Dilwale Dulhania Le Jayenge' ?",
            R.drawable.ddlj,
            "Jatin–Lalit",
            "A.R. Rehman",
            "Sonu Nigam",
            "Udit Narayan",
            1
        )
        questionlists.add(ques2)

        val ques3= ques(3,
            "Who sang the song 'Jaane na dunga kahin' from 'Never Kiss your Bestfriend' ?",
            R.drawable.nkybf,
            "Atif Aslam",
            "Arijit Singh",
            "Armaan Malik",
            "Anu Malik",
            3
        )
        questionlists.add(ques3)

        val ques4= ques(4,
            "Which song from the movie 'Kabhi Khushi Kabhie Gham' is often played during festive celebrations?",
            R.drawable.kkg,
            "Kabhi Khushi Kabhi Gham",
            "Bole Chudiyan",
            "Say Shawa Shawa",
            "Deewana hai dekho",
            2
            )
        questionlists.add(ques4)

        val ques5= ques(5,
            "Which Bollywood movie features the song 'Pee Loon' sung by Mohit Chauhan?",
            R.drawable.pee,
            "Why Cheat India ?",
            "Shootout at Wadala",
            "Jab We Met",
            "Once Upon a time in Mumbai",
            4
        )
        questionlists.add(ques5)

        val ques6= ques(6,
        "Which was the first song of 'Darshan Raval' ?",
            R.drawable.dr,
            "Asal Mein",
            "Ek Tarfa",
            "Pehli Mohabbat",
            "Tere Naal",
            3
        )
     questionlists.add(ques6)

        val ques7= ques(7,
        "Which Indian musician released the song 'Breathless' known for its rapid singing style?",
            R.drawable.shankar,
            "HariHaran",
            "Sudesh Bhosale",
            "Shankar Mahadevan",
            "Kailash Kher",
            3
        )
        questionlists.add(ques7)

        val ques8= ques(8,
        "Which song from the movie 'Jab Tak Hai Jaan' features the line 'Challa ki labh da phire' ?",
        R.drawable.jabtak,
        "Jab Tak Hai Jaan",
            "Challa",
            "Ishq Shava",
            "Jiya Re",
            2
        )
        questionlists.add(ques8)

        val ques9= ques(9,
        "Which playback singer sung 'Kasoor'",
            R.drawable.kasoor,
            "Anuv Jain",
            "Prateek Kuhad",
            "Sanam",
            "Aditya Bharadwaj",
            2
        )
        questionlists.add(ques9)

        val ques10= ques(10,
        "Which song from the movie 'Kabhi Alvida Naa Kehna' features the line 'Tumhi Dekho Naa'?",
            R.drawable.kkk,
            "Kabhi Alvida Na Kehna",
            "Mitwa",
            "Tumhi Dekho Na",
            "Rock N Roll Soniye",
            3

        )
        questionlists.add(ques10)

        return questionlists


    }
}