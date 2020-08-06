config.module.rules.push(
    {
        test: /\.(svg|png|jpe?g|gif)$/i,
        loader: 'file-loader',
        options: {
            name: 'static/media/[name].[hash:8].[ext]',
        },
    },
);