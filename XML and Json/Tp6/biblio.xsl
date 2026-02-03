<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
    
    <xsl:template match="/">
        <html>
            <head>
                <title>Ma Bibliotheque</title>
                <style>
                    body { font-family: Arial, sans-serif; margin: 20px; }
                    h1 { color: #333; }
                    .book-item { margin-bottom: 10px; font-size: 1.1em; }
                </style>
            </head>
            <body>
                <h1>Bibliotheque</h1>
                
                <xsl:for-each select="bibliotheque/livre">
                    <div class="book-item">
                        <xsl:value-of select="titre"/>
                        <xsl:text> </xsl:text> <xsl:value-of select="auteur"/>
                        <xsl:text> </xsl:text> <xsl:value-of select="ref"/>
                    </div>
                </xsl:for-each>
                
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>