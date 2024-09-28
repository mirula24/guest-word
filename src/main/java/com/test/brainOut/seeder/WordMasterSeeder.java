package com.test.brainOut.seeder;

import com.test.brainOut.entity.WordMaster;
import com.test.brainOut.repository.WordMasterRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Component
@RequiredArgsConstructor
public class WordMasterSeeder implements CommandLineRunner {

    private final WordMasterRepository wordMasterRepository;

    @Override
    public void run(String... args) throws Exception {
        if (wordMasterRepository.count() == 0) {
            List<WordMaster> wordMasters = List.of(
                    WordMaster.builder().word("Spring").clue("Framework populer untuk pengembangan aplikasi Java").build(),
                    WordMaster.builder().word("Hibernate").clue("Framework ORM untuk Java yang sering dipakai bersama JPA").build(),
                    WordMaster.builder().word("JPA").clue("Java Persistence API, digunakan untuk manajemen data").build(),
                    WordMaster.builder().word("REST").clue("Arsitektur untuk membangun web service").build(),
                    WordMaster.builder().word("JSON").clue("Format pertukaran data yang ringan dan mudah dibaca").build(),
                    WordMaster.builder().word("Kafka").clue("Platform streaming terdistribusi untuk pengiriman data real-time").build(),
                    WordMaster.builder().word("Docker").clue("Platform untuk mengembangkan, mengirimkan, dan menjalankan aplikasi di dalam container").build(),
                    WordMaster.builder().word("Kubernetes").clue("Sistem orkestrasi container yang kuat dan populer").build(),
                    WordMaster.builder().word("Microservices").clue("Pendekatan arsitektur yang membagi aplikasi menjadi layanan-layanan kecil").build(),
                    WordMaster.builder().word("OAuth2").clue("Protokol otentikasi untuk aplikasi pihak ketiga").build(),
                    WordMaster.builder().word("JWT").clue("JSON Web Token, digunakan untuk otentikasi berbasis token").build(),
                    WordMaster.builder().word("Swagger").clue("Alat untuk mendokumentasikan dan menguji API").build(),
                    WordMaster.builder().word("GraphQL").clue("Bahasa kueri untuk API yang memberikan lebih banyak fleksibilitas dibandingkan REST").build(),
                    WordMaster.builder().word("Redis").clue("Basis data in-memory yang digunakan untuk caching").build(),
                    WordMaster.builder().word("PostgreSQL").clue("Sistem manajemen basis data relasional open-source yang canggih").build(),
                    WordMaster.builder().word("MySQL").clue("Sistem manajemen basis data relasional yang banyak digunakan di web").build(),
                    WordMaster.builder().word("MongoDB").clue("Basis data NoSQL yang berbasis dokumen").build(),
                    WordMaster.builder().word("RabbitMQ").clue("Message broker yang digunakan untuk mengirim pesan antara aplikasi").build(),
                    WordMaster.builder().word("ElasticSearch").clue("Mesin pencarian dan analitik yang digunakan untuk pencarian cepat").build(),
                    WordMaster.builder().word("Jenkins").clue("Alat otomatisasi open-source yang membantu dalam integrasi dan pengiriman berkelanjutan").build()
            );

            // Simpan semua data ke database
            wordMasterRepository.saveAll(wordMasters);

            System.out.println("Data seeder dengan 20 entri berhasil dimasukkan.");
        } else {
            System.out.println("Data sudah ada, tidak perlu seeding.");
        }
    }
}
