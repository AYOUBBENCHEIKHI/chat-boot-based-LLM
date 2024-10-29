package org.enset_chatbot_rag;

import org.enset_chatbot_rag.config.RagDataLoader;
import org.junit.jupiter.api.Test;
import org.springframework.ai.embedding.EmbeddingModel;
import org.springframework.ai.vectorstore.SimpleVectorStore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.io.Resource;

import java.io.File;
import java.nio.file.Path;

import static org.mockito.Mockito.*;
import static org.assertj.core.api.Assertions.*;
/*
@SpringBootTest
public class RagDataLoaderTest {

    @Autowired
    private RagDataLoader ragDataLoader;

    @MockBean
    private EmbeddingModel embeddingModel;

    @MockBean
    private Resource pdfresource;

    @Test
    public void testSimpleVectorStore_ModelNotFound() throws Exception {
        // Simuler une ressource PDF manquante
        when(pdfresource.getFile()).thenThrow(new RuntimeException("Resource not found"));

        // Définir un chemin inexistant pour le fichier store
        String invalidStoreFilePath = Path.of("src", "main", "resources", "store", "store-data-v1.json")
                .toAbsolutePath().toString();
        File invalidFile = new File(invalidStoreFilePath);
        if (invalidFile.exists()) {
            invalidFile.delete();
        }

        // Vérifier que l'exception est bien levée si le modèle n'est pas trouvé
        assertThatThrownBy(() -> ragDataLoader.simpleVectorStore(embeddingModel))
                .isInstanceOf(RuntimeException.class)
                .hasMessageContaining("Resource not found");
    }

    @Test
    public void testSimpleVectorStore_Success() throws Exception {
        // Simuler le fichier PDF et les ressources trouvées
        when(pdfresource.getFile()).thenReturn(new File("src/main/resources/pdfs/cv.pdf"));

        SimpleVectorStore vectorStore = ragDataLoader.simpleVectorStore(embeddingModel);

        // Vérification que le SimpleVectorStore a bien été créé
        assertThat(vectorStore).isNotNull();
    }
}
*/