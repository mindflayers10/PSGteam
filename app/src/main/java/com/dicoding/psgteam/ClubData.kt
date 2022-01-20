package com.dicoding.psgteam

object ClubData {

    private val clubNames = arrayOf("Achraf Hakimi",
        "Ander Herrera",
        "Angel di Maria",
        "Kylian Mbappe",
        "Keylor Navas",
        "Lionel Messi",
        "Neymar",
        "Sergio Ramos",
        "Sergio Rico",
        "Xavi Simons")

    private val clubDetails = arrayOf(
        "Achraf Hakimi Mouh adalah pemain sepak bola profesional Maroko yang bermain sebagai bek untuk klub Ligue 1 Paris Saint-Germain dan tim nasional Maroko. Ia bergabung dengan akademi Real Madrid pada tahun 2006, dan dimainkan untuk setiap kategori junior sejak saat itu.\n"+
                "Tanggal lahir	4 November 1998 (umur 22)\n"+
                "Tempat lahir	Madrid, Spanyol\n"+
                "Tinggi	1,81 cm (5 ft 12 in)\n"+
                "Posisi bermain	Bek kanan\n"+
                "Nomor Punggung 2.",
        "Ander Herrera Agüera adalah pemain sepak bola Spanyol yang bermain di PSG sebagai gelandang tengah. Ia dicintai fans karena totalitas dan kerja kerasnya di lapangan untuk membantu timnya. Kecintaan fans itu terbukti ketika pada tahun 2017 ia dinobatkan sebagai pemenang Sir Matt Busby Award(Pemain Terbaik Manchester United).\n"+
                "Tanggal lahir	14 Agustus 1989 (umur 32)\n"+
                "Tempat lahir	Bilbao, Spanyol\n"+
                "Tinggi	1,82 m (6 ft 0 in)\n"+
                "Posisi bermain	Gelandang\n"+
                "Nomor Punggung 21.",
        "Ángel Fabián di María Hernández merupakan seorang pemain sepak bola Argentina yang kini bermain untuk klub Paris Saint Germain dan Argentina. Dia dapat berposisi sebagai gelandang sayap atau winger, Awal Agustus 2015, Manchester United secara resmi mengumumkan bahwa mereka telah melepas wingernya asal Argentina ini.\n"+
                "Tanggal lahir	14 Februari 1988 (umur 33)\n"+
                "Tempat lahir	Rosario, Argentina\n"+
                "Tinggi	1,80 m (5 ft 11 in)\n"+
                "Posisi bermain	Gelandang sayap\n"+
                "Nomor Punggung 11.",
        "Kylian Mbappé Lottin adalah seorang pemain sepak bola profesional Prancis yang bermain sebagai penyerang untuk Paris Saint-Germain dan tim nasional Prancis, Mbappé sudah menonjol pada usia dini, ia menjadi bintang bagi akademi remaja di AS Bondy, INF Clairefontaine, dan Monaco, klub terakhir ini membuat debutnya sebagai seorang pemain profesional untuk tim cadangan. Mbappé segera menjadi starter reguler dan pencetak gol untuk tim pertama di musim 2016-17, membantu klub mendapatkan gelar pertama mereka di Ligue 1 di usia tujuh belas tahun.\n"+
                "Tanggal lahir	20 Desember 1998 (umur 22)\n"+
                "Tempat lahir	Paris, Prancis\n"+
                "Tinggi	1,78 m (5 ft 10 in)\n"+
                "Posisi bermain	penyerang\n"+
                "Nomor Punggung 7.",
        "Keylor Antonio Navas Gamboa adalah pemain sepak bola profesional asal Kosta Rika yang bermain untuk klub Paris Saint-Germain F.C. di Ligue 1, sebagai seorang penjaga gawang, Navas muncul dengan Los Ticos dalam dua edisi Piala Emas CONCACAF, ia dinobatkan sebagai penjaga gawang terbaik tahun 2009, membantu negaranya ke semifinal.\n"+
                "Tanggal lahir	15 Desember 1986 (umur 34)\n"+
                "Tempat lahir	San Isidro, Kosta Rika\n"+
                "Tinggi	1,84 m (6 ft 0 in)\n"+
                "Posisi bermain	Penjaga gawang\n"+
                "Nomor Punggung 1.",
        "Lionel Andrés Messi juga dikenal sebagai Leo Messi, adalah seorang pemain sepak bola profesional asal Argentina yang bermain sebagai penyerang untuk klub Ligue 1 Paris Saint-Germain dan merupakan kapten tim nasional Argentina.Sering dianggap sebagai pemain terbaik di dunia dan sering dianggap sebagai pemain terhebat sepanjang masa.\n"+
                "Tanggal lahir 24 Juni 1987 (umur 34)\n"+
                "Tempat lahir	Rosario, Argentina\n"+
                "Tinggi	170 cm (5 ft 7 in)\n"+
                "Posisi bermain	Penyerang.\n"+
                "Nomor Punggung 30",
        "Neymar da Silva Santos Júnior yang umumnya dikenal sebagai Neymar atau Neymar Jr, adalah pemain sepak bola profesional Brasil yang bermain untuk klub Prancis Paris Saint-Germain. Dia bermain sebagai penyerang atau pemain sayap.Pada usia 19 tahun, Neymar memenangkan Pemain terbaik Amerika Selatan tahun 2011, setelah berada di peringkat ketiga pada tahun 2010. Dia masuk nominasi yang sama dan memenangkan lagi pada tahun 2012. Pada tahun 2011 Neymar menerima nominasi untuk FIFA Ballon d'Or , di mana ia menempati urutan 10, dan FIFA Puskás Award untuk Goal of the Year.\n"+
                "Tanggal lahir	5 Februari 1992 (umur 29)\n"+
                "Tempat lahir	Mogi das Cruzes, São Paulo, Brasil\n"+
                "Tinggi	1,75 m (5 ft 9 in)\n"+
                "Posisi bermain	Penyerang\n"+
                "Nomor Punggung 10.",
        "Sergio Ramos merupakan seorang pemain sepak bola asal Spanyol yang bermain untuk klub Paris Saint-German pada posisi bek tengah. Ia dikenal khalayak luas sebagai bek Real Madrid selama 16 musim.Sergio Ramos masuk dalam tim terbaik versi FIFA dan UEFA pada tahun 2008.\n"+
                "Tanggal lahir	30 Maret 1986 (umur 35)\n"+
                "Tempat lahir	Camas, Spain\n"+
        "Tinggi	1,83 m (6 ft 0 in)\n"+
                "Posisi bermain	Bek tengah\n"+
                "Nomor Punggung 4.",
        "Sergio Rico González adalah pemain sepak bola profesional Spanyol yang bermain untuk Sevilla FC sebagai penjaga gawang. Ia bergabung dengan Sevilla, dimana ia dua kali memenangi Liga Eropa. Rico membuat debut senior internasionalnya untuk Spanyol pada 2016, dan ia masuk daftar skuat Spanyol di Kejuaraan Euro 2016.\n"+
                "Tanggal lahir	1 September 1993 (umur 28)\n"+
                "Tempat lahir	Sevilla, Spanyol\n"+
                "Tinggi	1,95 m (6 ft 5 in)\n"+
                "Posisi bermain	Penjaga gawang\n"+
                "Nomor Punggung 1.",
        "Xavier Quentin Shay Simons adalah pesepakbola profesional Belanda yang bermain sebagai gelandang untuk klub Ligue 1 Paris Saint-Germain.Simons bergabung dengan pengaturan muda dari Barcelona pada 2010 dari CD Tháder, dan cepat berkembang menjadi salah satu pemain klub Spanyol itu paling dinilai pemuda, dengan klub Inggris Chelsea , serta raksasa Spanyol Real Madrid , dikabarkan mencoba untuk mengontraknya di usia muda.Pada Juli 2019, Simons pindah ke klub Prancis Paris Saint-Germain , setelah gagal menyetujui kontrak baru dengan Barcelona.\n"+
                "Tanggal lahir	21 April 2003 (umur 18)\n"+
                "Tempat Lahir	Amsterdam , Belanda\n"+
                "Tinggi	1,73 m (5 kaki 8 inci)\n"+
                "Posisi bermain	Gelandang\n"+
                "Nomor Punggung 34")

    private val clubsImages = intArrayOf(
        R.drawable.achraf_hakimi,
        R.drawable.ander_herrera,
        R.drawable.angel_di_maria,
        R.drawable.k_mbappe,
        R.drawable.keylor_navas,
        R.drawable.lionel_messi,
        R.drawable.neymar,
        R.drawable.sergio_ramos,
        R.drawable.sergio_rico,
        R.drawable.xavi_simons)

    val listData: ArrayList<Club>
        get() {
            val list = arrayListOf<Club>()
            for (position in clubNames.indices) {
                val club = Club()
                club.name = clubNames[position]
                club.detail = clubDetails[position]
                club.photo = clubsImages[position]
                list.add(club)
            }
            return list
        }
}