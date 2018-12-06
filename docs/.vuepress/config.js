module.exports = {
  head: [
    ['meta', {
      name: 'author',
      content: 'Владислав Люминарский'
    }],
    ['meta', {
      name: 'theme-color',
      content: '#3eaf7c'
    }],
    ['link', {
      rel: 'icon',
      href: '/icons/icon512.png'
    }],
    ['link', {
      rel: 'manifest',
      href: '/manifest.webmanifest'
    }]
  ],
  locales: {
    '/': {
      lang: 'ru-RU',
      title: 'Программирование на Java',
      description: 'Учебные материалы по курсу "Программирование на Java".'
    }
  },
  themeConfig: {
    sidebar: [
      '/',
      {
        title: 'Лабораторные работы',
        collapsable: false,
        children: [
          '/labs/01',
          '/labs/02',
          '/labs/03',
        ]
      },
    ],
    lastUpdated: 'Последнее обновление',
    repo: 'Java-materials/Java-course',
    docsDir: 'docs',
    editLinks: true,
    editLinkText: 'Редактировать эту страницу',
    serviceWorker: {
      updatePopup: {
        message: "Доступно новое содержимое.",
        buttonText: "Обновить"
      }
    },
    algolia: {
      apiKey: '892ad28dc056e1eb225c126678ef1c09',
      indexName: 'c_vladislav',
      algoliaOptions: {
        facetFilters: ["tags:java"]
      }
    }
  },
  serviceWorker: true,
  evergreen: true
};