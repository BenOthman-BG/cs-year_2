<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    <xsl:output method="html" encoding="UTF-8" indent="yes"/>

    <xsl:template match="/">
        <html>
        <head>
            <title>Catalogue Produits</title>
            <link rel="stylesheet" type="text/css" href="style.css" />
        </head>
        <body>
            <h1>📦 Liste du Catalogue</h1>
            <table>
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Désignation</th>
                        <th>Catégorie</th>
                        <th>Prix</th>
                        <th>Stock</th>
                        <th>Description</th>
                    </tr>
                </thead>
                <tbody>
                    <xsl:for-each select="catalogue/produit">
                        <tr>
                            <td><span class="id-badge"><xsl:value-of select="@id_produit"/></span></td>
                            <td><xsl:value-of select="nom_produit"/></td>
                            <td><xsl:value-of select="categorie"/></td>
                            <td class="price-tag">
                                <xsl:value-of select="prix"/> 
                                <xsl:text> </xsl:text>
                                <xsl:value-of select="prix/@devise"/>
                            </td>
                            <td>
                                <xsl:choose>
                                    <xsl:when test="stock &lt; 5">
                                        <span class="stock-warning"><xsl:value-of select="stock"/> (Bas !)</span>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <xsl:value-of select="stock"/>
                                    </xsl:otherwise>
                                </xsl:choose>
                            </td>
                            <td><xsl:value-of select="description"/></td>
                        </tr>
                    </xsl:for-each>
                </tbody>
            </table>
        </body>
        </html>
    </xsl:template>
</xsl:stylesheet>