# DecompressionHuffman
<p>Dans le cadre d'un projet de 3ème année en IDU3 à Polytech Annecy-Chambéry, il m'est demandé de décoder un fichier <code>exemple_comp.bin</code> qui à été compréssé avec la méthode d'Huffman puis transformé en octets.</p>

<p>Afin de décoder ce fichier, j'ai à disposition un fichier <code>exemple_freq.txt</code> contenant les fréquences d'apparition de chaque caractères du fichier à décoder </p>

<p>Plusieurs étapes me permettent de décoder ce fichier :</p>
<ul>
  <li>Récupérer les fréquences d'apparition des caractères pour construire un arbre selon la méthode d'Huffman</li>
  <li>Convertir les octets du fichier <code>exemple_comp.bin</code> en bits</li>
  <li>Parcourir les l'arbre d'Huffman grâce aux bits (0 = Noeud gauche, 1 = Noeud droit) jusqu'à tomber sur un caractere</li>
  <li>En associant les caractères, on à décodé le message</li>
</ul>

<p> Pour une description plus détaillée, veuillez consulter le document <code>sujet.pdf</code> présent dans le répertoire.
