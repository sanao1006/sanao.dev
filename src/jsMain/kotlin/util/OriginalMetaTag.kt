package util

object OriginalMetaTag {
    val meta = """
     <meta name="viewport" content="width=device-width, initial-scale=1, viewport-fit=cover">
     <meta charset="UTF-8">
     <title>sanao.dev</title>
     <link href="prism.css" rel="stylesheet">
     <link rel="shortcut icon" href="./favicon.ico" type="image/x-icon">
     <script async="" src="https://www.googletagmanager.com/gtag/js?id=G-CRMFJX41K8"></script>
     <script>
         window.dataLayer = window.dataLayer || [];
         function gtag(){dataLayer.push(arguments);}
         gtag('js', new Date());
         gtag('config', 'G-CRMFJX41K8');
     </script>
    """.trimIndent()
}