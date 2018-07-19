module.exports = {
  base: '/Java-course-website/',
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
    lastUpdated: true,
    repo: 'Vladislav-Lyuminarskiy/Java-course',
    docsDir: 'docs',
    editLinks: true
  },
  serviceWorker: true
}